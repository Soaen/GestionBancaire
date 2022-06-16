package fr.example.services;

import java.util.Scanner;

public class ClientManagment {
    Scanner sc = new Scanner(System.in);
    public void creerClient() {
        System.out.println("Identifiant Client : ");
        double id = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nom du client : ");
        String lastName = sc.nextLine();
        System.out.println("Prénom du client : ");
        String name = sc.nextLine();
        System.out.println("Date de naissance : ");
        String birthDate = sc.nextLine();
        System.out.println("Email du client : ");
        String email = sc.nextLine();
    }
}
