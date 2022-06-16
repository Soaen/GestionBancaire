package fr.example.services;

public class ServiceManagment {
    AgencyManagment am = new AgencyManagment();
    ClientManagment cm = new ClientManagment();
    public void firstMenu(int choix) {
        switch (choix){
            case 1 :
                am.creerAgence();
                break;
            case 2 :
                cm.creerClient();
                break;
            case 3 :
//                creerCompteBancaire
            case 4 :
                cm.searchClient();
            case 5 :
//                rechercheClient
            case 6 :
//                afficherCompteClient
            case 7:
//                imprimerInfoClient
            case 8 :
//                quitterProgramme
        }
    }
}
