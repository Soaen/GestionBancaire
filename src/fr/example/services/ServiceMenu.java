package fr.example.services;

import java.util.Scanner;

public class ServiceMenu {
    int choix = 0;
    Scanner sc = new Scanner(System.in);
    ServiceManagment sm = new ServiceManagment();
    public void startingMenu(){
        do{
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("*                                                     *");
            System.out.println("*     1. Créer une agence                             *");
            System.out.println("*                                                     *");
            System.out.println("*     2. Créer un client                              *");
            System.out.println("*                                                     *");
            System.out.println("*     3. Créer un compte bancaire                     *");
            System.out.println("*                                                     *");
            System.out.println("*     4. Recherche de compte                          *");
            System.out.println("*                                                     *");
            System.out.println("*     5. Recherche de client                          *");
            System.out.println("*                                                     *");
            System.out.println("*     6. Afficher la liste des comptes d'un client    *");
            System.out.println("*                                                     *");
            System.out.println("*     7. Imprimer les infos client                    *");
            System.out.println("*                                                     *");
            System.out.println("*     8. Afficher la liste des Agences                *");
            System.out.println("*                                                     *");
            System.out.println("*     9. Afficher la liste des Clients                *");
            System.out.println("*                                                     *");
            System.out.println("*     10. Quitter le programme                         *");
            System.out.println("*                                                     *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("Entrez votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();
            sm.firstMenu(choix);
        }while(choix != 10);
    }
}