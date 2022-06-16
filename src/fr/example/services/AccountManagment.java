package fr.example.services;

import java.util.Scanner;

    public class AccountManagment {
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        public void creerCompte() {
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("*                                                     *");
            System.out.println("*     1. Créer un compte courant                      *");
            System.out.println("*                                                     *");
            System.out.println("*     2. Créer un livret A                            *");
            System.out.println("*                                                     *");
            System.out.println("*     3. Créer un plan épargne logement               *");
            System.out.println("*                                                     *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("Entrez votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();
        }
    }