package fr.example.beans;

public class Compte {
    int nbAccount;
    int codeAgency;
    int balance;
    Client client;
    boolean overdraft;

    public Compte(int nbAccount, int codeAgency, int balance, boolean overdraft, Client client) {
        this.nbAccount = nbAccount;
        this.codeAgency = codeAgency;
        this.balance = balance;
        this.overdraft = overdraft;
        this.client = client;
    }


    public int getNbAccount() {
        return nbAccount;
    }

    public Compte() {}
}
