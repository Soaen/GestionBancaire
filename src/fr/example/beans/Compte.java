package fr.example.beans;

public class Compte {
    int nbAccount;
    int codeAgency;
    int balance;
    Boolean overdraft;

    public Compte(int nbAccount, int codeAgency, int balance, Boolean overdraft) {
        this.nbAccount = nbAccount;
        this.codeAgency = codeAgency;
        this.balance = balance;
        this.overdraft = overdraft;
    }
}
