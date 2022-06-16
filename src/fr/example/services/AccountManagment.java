package fr.example.services;

import fr.example.beans.Compte;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AccountManagment {
    ArrayList<Compte> accountList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int choix = 0;

    public void creerCompte() {
        System.out.println("Numéro de compte : ");
        int nbAccount = sc.nextInt();
        sc.nextLine();
        System.out.println("Code Agence : ");
        int agencyCode = sc.nextInt();
        sc.nextLine();
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
}