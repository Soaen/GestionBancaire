package fr.example.beans;

public class Agency {
    String codeAgency;
    String nameAgency;
    String addressAgency;

    public Agency(String codeAgency, String nameAgency, String addressAgency) {
        this.codeAgency = codeAgency;
        this.nameAgency = nameAgency;
        this.addressAgency = addressAgency;
    }

    public String getCodeAgency() {
        return codeAgency;
    }

    public String getNameAgency() {
        return nameAgency;
    }

    public String getAddressAgency() {
        return addressAgency;
    }

    public Agency(){}
}
