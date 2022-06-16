package fr.example.services;

import fr.example.beans.Client;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientManagment {
    Scanner sc = new Scanner(System.in);
    ArrayList<Client> clientList = new ArrayList<Client>();
    public void creerClient() {
        System.out.println("Identifiant Client : ");
        String id = sc.nextLine();
        System.out.println("Nom du client : ");
        String lastName = sc.nextLine();
        System.out.println("Prénom du client : ");
        String name = sc.nextLine();
        System.out.println("Date de naissance : (Format: yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(sc.nextLine());
        System.out.println("Email du client : ");
        String email = sc.nextLine();
        clientList.add(new Client(id, lastName, name, birthDate, email));
    }


    public void searchClient(String id){
        clientList.forEach(e ->{
            if(e.getId() == id){
                System.out.println("ID : " + e.getId() );
            }
        });
    }
}
