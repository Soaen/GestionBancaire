package fr.example.beans;

import java.time.LocalDate;

public class Client extends Compte{
    String id;
    String name;
    String surname;
    LocalDate birth;
    String email;
    Compte compte = new Compte();

    public Client(String id, String name, String surname, LocalDate birth, String email){
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.email = email;
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

    public LocalDate getBirth() {
        return birth;
    }

    public String getEmail() {
        return email;
    }
    public float getNbAccount(){
        return client.getNbAccount();
    }
}
