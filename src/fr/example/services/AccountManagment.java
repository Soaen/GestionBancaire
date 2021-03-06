package fr.example.services;

import fr.example.beans.*;


import java.util.ArrayList;
import java.util.Scanner;

public class AccountManagment {
    static ArrayList<Compte> accountList = new ArrayList<>();
    ClientManagment cm = new ClientManagment();
    Scanner sc = new Scanner(System.in);
    int choix = 0;
    int nbAccount = 0;


    public void creerCompte() {
        if(nbAccount >= 3){
            System.out.println("Tu ne peux pas créer plus de compte !");
        }else{
            nbAccount++;
            System.out.println("Numéro de compte : ");
            float nbAccount = sc.nextFloat();
            while(String.valueOf(nbAccount).length() != 11){
                System.out.println("Le numéro de compte doit être de 11 caractères !");
                System.out.println("Numéro de compte : ");
                nbAccount = sc.nextFloat();
            }
            System.out.println("Code Agence : ");
            int agencyCode = sc.nextInt();
            System.out.println("Solde : ");
            int balance = sc.nextInt();
            sc.nextLine();
            System.out.println("Découvert autorisé O/N : ");
            String tooMuch = sc.nextLine();
            while (!tooMuch.equals("O") && !tooMuch.equals("N")) {
                System.out.println("Merci d'écrire 'O' ou 'N' !");
                System.out.println("Découvert autorisé O/N : ");
                tooMuch = sc.nextLine();
            }
            boolean overdraft = tooMuch.equals("O");
            System.out.println("quel est l'id du client du compte ?");
            String id = sc.nextLine();
            Client client = cm.searchClient(id);
            System.out.println("Quel type de compte voulez-vous créer ? ");
            System.out.println("1 = Compte courant");
            System.out.println("2 = Livret A");
            System.out.println("3 = Plan Épargne Logement");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    accountList.add(new Courant(nbAccount, agencyCode, balance, overdraft, client));
                    break;
                case 2:
                    accountList.add(new LivretA(nbAccount, agencyCode, balance, overdraft, client));
                    break;
                case 3:
                    accountList.add(new Logement(nbAccount, agencyCode, balance, overdraft, client));
                    break;
                default:
                    System.out.println("Entrez un chiffre entre 1 et 3 !");
            }
        }

    }

    public void searchAccount() {
        System.out.println("Quel est l'ID du compte ?");
        float id = sc.nextFloat();
        accountList.forEach(e -> {
            if (e.getNbAccount() == id) {
                System.out.println("Numéro de compte : ");
                System.out.println(e.getNbAccount());
                System.out.println("Code de l'agence : ");
                System.out.println(e.getCodeAgency());
                System.out.println("Solde : ");
                System.out.println(e.getBalance());
            }
        });
    }

    public static float getAccountNb(Client e){
        return e.getNbAccount();
    }
}
