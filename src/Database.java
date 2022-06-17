public class Database {
    public static Utente[] listaUtenti = new Utente[5];
    public static Veicolo[] listaVeicoli = new Veicolo[8];

    public static void riempiListaUtenti(){
        for(int i = 0; i < listaUtenti.length; i++){
            listaUtenti[i] = new Utente("nome"+i, "cognome"+i, "10/10/1910", "jssnfjsn"+i, "B");
        }
    }

    public static void riempiListaVeicoli(){
        listaVeicoli[0] = new Automobile("0", "Roma ", "gh938dn", 0.29, "B");
        listaVeicoli[1] = new Automobile("1", "Milano ", "rh932fr", 0.29, "B");
        listaVeicoli[2] = new Moto("7", "Torino ", "gd918fg", 0.19, "A");
        listaVeicoli[3] = new Moto("2", "Napoli", "g2332fn", 0.17, "A");
        listaVeicoli[4] = new Furgoncino("3", "Catania", "gh938dn", 0.35, "B");
        listaVeicoli[5] = new Furgoncino("4", "Genova", "gh938dn", 0.37, "B");
        listaVeicoli[6] = new Monopattino("5", "Cagliari", 0.29);
        listaVeicoli[7] = new Bicicletta("6", "Bologna",0.29);
    }
}
