package fr.example.services;

import fr.example.beans.Agency;

import java.util.ArrayList;
import java.util.Scanner;

public class AgencyManagment {
    ArrayList<Agency> agencyList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Agency ag = new Agency();
    public void creerAgence(){
        System.out.println("Entrez un code Agence disponible");
        int agencyCode = sc.nextInt();
        while(ag.getCodeAgency() == agencyCode){
            System.out.println("Code agence déjà utilisé ! choisissez en un autre !");
            System.out.println("Entrez un code Agence disponible");
            agencyCode = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Quel est le nom de l'agence ?");
        String nameAgency = sc.nextLine();
        System.out.println("Quel est l'adresse de l'agence ?");
        String addressAgency = sc.nextLine();
        agencyList.add(new Agency(agencyCode, nameAgency, addressAgency));
    }
}
