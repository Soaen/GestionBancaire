package fr.example.beans;

public class Agency {
    int codeAgency;
    String nameAgency;
    String addressAgency;

    public Agency(int codeAgency, String nameAgency, String addressAgency) {
        this.codeAgency = codeAgency;
        this.nameAgency = nameAgency;
        this.addressAgency = addressAgency;
    }

    public int getCodeAgency() {
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
