package fr.example.services;

import java.util.Scanner;

public class AccountManagment {
    Scanner sc = new Scanner(System.in);
    int choix = 0;

    public void creerCompte() {
            System.out.println("Quel type de compte voulez-vous créer ? ");
            System.out.println("1 = Compte courant");
            System.out.println("2 = Livret A");
            System.out.println("3 = Plan Épargne Logement");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
//              newCompteCourant
                case 2:
//              newLivretA
                case 3:
//              newPeLogement
            }
        }
    }