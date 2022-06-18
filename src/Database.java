public class Database {

    public static Utente[] nome = new Utente[5];
    public static Veicolo[] veicolo = new Veicolo[8];

    public static void riempiListe() {
        for (int i = 0; i < nome.length; i++) {
            nome[i] = new Utente("nome" + i, "cognome" + i, "15/01/1988" + i, "NNLL" + 1, "B");
        }
    }

    public static void riempiVeicolo() {
        veicolo[0] = new Automobile("01", "Roma", 0.29, "FF", "B");
        veicolo[1] = new Automobile("02", "Roma", 0.30, "EE", "B");
        veicolo[2] = new Moto ("03", "Milano", 0.19, "FV", "A");
        veicolo[3] = new Moto ("04", "Torino", 0.17, "AA", "A");
        veicolo[4] = new Furgone("05", "Napoli", 0.35, "FP", "B");
        veicolo[5] = new Furgone("06", "Roma", 0.39, "EF", "B");
        veicolo[6] = new Bicicletta("07", "Firenze", 0.10);
        veicolo[7] = new Monopattino("08", "Bologna", 0.30);
    }
}

