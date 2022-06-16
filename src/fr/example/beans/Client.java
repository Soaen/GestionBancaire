package fr.example.beans;

import java.time.LocalDate;

public class Client extends Compte{
    int id;
    String name;
    String surname;
    LocalDate birth;
    String email;

    public Client(int nbAccount, int codeAgency, int balance, Boolean overdraft, int id, String name, String surname, LocalDate birth, String email) {
        super(nbAccount, codeAgency, balance, overdraft);
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.email = email;
    }


}
