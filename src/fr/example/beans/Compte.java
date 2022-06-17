package fr.example.beans;

public class Compte {
    float nbAccount;
    int codeAgency;
    int balance;
    Client client;
    boolean overdraft;

    public Compte(float nbAccount, int codeAgency, int balance, boolean overdraft, Client client) {
        this.nbAccount = nbAccount;
        this.codeAgency = codeAgency;
        this.balance = balance;
        this.overdraft = overdraft;
        this.client = client;
    }


    public float getNbAccount() {
        return nbAccount;
    }

    public int getCodeAgency() {
        return codeAgency;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isOverdraft() {
        return overdraft;
    }

    public Compte() {}


}
