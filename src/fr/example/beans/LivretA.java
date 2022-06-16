package fr.example.beans;

import fr.example.interfaces.ILivretA;

public class LivretA extends Compte implements ILivretA {
    public LivretA(int nbAccount, int codeAgency, int balance, boolean overdraft, Client client) {
        super(nbAccount, codeAgency, balance, overdraft, client);
    }
}
