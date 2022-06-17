package fr.example.beans;

import java.time.LocalDate;

public class Client extends Compte{
    String id;
    String name;
    String surname;
    LocalDate birth;
    String email;

    public Client(String id, String name, String surname, LocalDate birth, String email){
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.email = email;
    }

    public Client(float nbAccount, int codeAgency, int balance, Boolean overdraft, Client client, String id) {
        super(nbAccount, codeAgency, balance, overdraft, client);
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public int getBalance(){
        return balance;
    }
    public int getCodeAgency(){
        return codeAgency;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirth() {
        return birth;
    }

}
