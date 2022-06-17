package fr.example.services;

import fr.example.beans.Agency;

import java.util.ArrayList;
import java.util.Scanner;

public class AgencyManagment {
    ArrayList<Agency> agencyList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void creerAgence(){
        System.out.println("Entrez un code Agence disponible");
        String agencyCode = sc.nextLine();
        System.out.println("Quel est le nom de l'agence ?");
        String nameAgency = sc.nextLine();
        System.out.println("Quel est l'adresse de l'agence ?");
        String addressAgency = sc.nextLine();
        agencyList.add(new Agency(agencyCode, nameAgency, addressAgency));
    }

    public void listAgence(){
        agencyList.forEach(e -> {
            System.out.println("Code Agence");
            System.out.println(e.getCodeAgency());
            System.out.println("Nom de l'agence");
            System.out.println(e.getNameAgency());
            System.out.println("Adresse de l'agence");
            System.out.println(e.getAddressAgency());
        });
    }
}
