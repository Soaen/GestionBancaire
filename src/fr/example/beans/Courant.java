package fr.example.beans;

import fr.example.interfaces.ICourant;

public class Courant extends Compte implements ICourant  {
    public Courant(int nbAccount, int codeAgency, int balance, boolean overdraft, Client client) {
        super(nbAccount, codeAgency, balance, overdraft, client);
    }
}