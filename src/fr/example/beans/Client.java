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

    public Client(float nbAccount, int codeAgency, int balance, Boolean overdraft, Client client) {
        super(nbAccount, codeAgency, balance, overdraft, client);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirth() {
        return birth;
    }

}
