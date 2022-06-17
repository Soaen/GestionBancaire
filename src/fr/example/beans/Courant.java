package fr.example.beans;

import fr.example.interfaces.ICourant;

public class Courant extends Compte implements ICourant  {
    public Courant(float nbAccount, int codeAgency, int balance, boolean overdraft, Client client) {
        super(nbAccount, codeAgency, balance, overdraft, client);
    }
//    public void fraisTenueCompte(){
//        balance -= 25;
//        System.out.println("25€ ont été retiré comme frais de tenue !");
//    }
}