package fr.example.services;

public class ServiceManagment {
    AgencyManagment am = new AgencyManagment();
    ClientManagment cm = new ClientManagment();
    AccountManagment ac = new AccountManagment();
    public void firstMenu(int choix) {
        switch (choix){
            case 1 :
                am.creerAgence();
                break;
            case 2 :
                cm.creerClient();
                break;
            case 3 :
                ac.creerCompte();
                break;
            case 4 :
                ac.searchAccount();
                break;
            case 5 :
                cm.searchClient();
                break;
            case 6 :
              cm.listClient();
              break;
            case 7:
                cm.infoClient();
                break;
            case 8:
                am.listAgence();
                break;
            case 9 :
                System.out.println("Au revoir !");
                break;
            default:
                System.out.println("Le nombre doit être compris entre 1 et 8 !");
        }
    }
}
