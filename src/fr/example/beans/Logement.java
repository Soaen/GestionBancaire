package fr.example.beans;

import fr.example.interfaces.ILogement;

public class Logement extends Compte implements ILogement {
    public Logement(int nbAccount, int codeAgency, int balance, boolean overdraft, Client client) {
        super(nbAccount, codeAgency, balance, overdraft, client);
    }
}
