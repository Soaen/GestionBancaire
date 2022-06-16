package fr.example.services;

import fr.example.beans.Compte;


import java.util.ArrayList;
import java.util.Scanner;

public class AccountManagment {
    ArrayList<Compte> accountList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int choix = 0;

    public void creerCompte() {
        System.out.println("Numéro de compte : ");
        float nbAccount = sc.nextInt();
        System.out.println("Code Agence : ");
        int agencyCode = sc.nextInt();
        System.out.println("Solde : ");
        int balance = sc.nextInt();
        sc.nextLine();
        System.out.println("Découvert autorisé O/N : ");
        String tooMuch = sc.nextLine();
        while(!tooMuch.equals("O") && !tooMuch.equals("N")){
            System.out.println("Merci d'écrire 'O' ou 'N' !");
            System.out.println("Découvert autorisé O/N : ");
            tooMuch = sc.nextLine();
        }
        boolean overdraft = tooMuch.equals("O");
        sc.nextLine();
        System.out.println("Quel type de compte voulez-vous créer ? ");
        System.out.println("1 = Compte courant");
        System.out.println("2 = Livret A");
        System.out.println("3 = Plan Épargne Logement");
        choix = sc.nextInt();
        switch (choix) {
            case 1:

                break;
            case 2 :
//              newLivretA
                break;
            case 3 :
//              newPeLogement
                break;
            default :
                System.out.println("Entrez un chiffre entre 1 et 3 !");
        }
    }


    public void searchAccount(){
        System.out.println("Quel est l'ID du compte ?");
        String id = sc.nextLine();
        accountList.forEach(e -> {
            System.out.println("Numéro de compte : ");
            System.out.print(e.getNbAccount());
            System.out.println("Code de l'agence : ");
            System.out.print(e.getCodeAgency());
            System.out.println("Solde : ");
            System.out.print(e.getBalance());
            System.out.println("Client : ");
            System.out.print(e.getClient());
        });
    }
}