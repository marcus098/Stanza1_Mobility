import java.util.Scanner;

public class Database {

    public static Utente[] nome = new Utente[5];
    public static Veicolo[] veicolo = new Veicolo[8];
    public static int count = 0;

    // Metodi
    // Test utenti
    public static void testRiempiListe() {
        for (int i = 0; i < nome.length; i++) {
            nome[i] = new Utente("nome" + i, "cognome" + i, "15/01/1988" + i, "NNLL" + 1, PatentiGuida.B);
        }
    }

    public static void riempiVeicolo() {
        veicolo[0] = new Automobile("01", "Roma", 0.29, "FF", PatentiGuida.B);
        veicolo[1] = new Automobile("02", "Roma", 0.30, "EE", PatentiGuida.B);
        veicolo[2] = new Moto("03", "Milano", 0.19, "FV", PatentiGuida.A);
        veicolo[3] = new Moto("04", "Torino", 0.17, "AA", PatentiGuida.A);
        veicolo[4] = new Furgone("05", "Napoli", 0.35, "FP", PatentiGuida.C);
        veicolo[5] = new Furgone("06", "Roma", 0.39, "EF", PatentiGuida.C);
        veicolo[6] = new Bicicletta("07", "Firenze", 0.10);
        veicolo[7] = new Monopattino("08", "Bologna", 0.30);
    }

    public static void aggiungiUtente(Scanner input) {
        System.out.println("Inserire Nome: ");
        String name = input.nextLine();
        System.out.println("Inserire Cognome: ");
        String cognome = input.nextLine();
        System.out.println("Inserire data di nascita: ");
        String dataNascita = input.nextLine();
        System.out.println("Inserire codice fiscale: ");
        String codiceFiscale = input.nextLine();
        int numbPatente = -1;
        while (numbPatente < 0 || numbPatente > 3)
        {
            System.out.println("Inserire il numero corrispondente alla patente di guida: "
                    + "\n 0 : nessuna patente \n 1 : patente A \n 2 : patente B \n 3 : patente C");
            numbPatente = input.nextInt();
        }
        PatentiGuida p = PatentiGuida.NULL;
        p = p.setPatenteGuida(numbPatente);
        nome[count] = new Utente(name, cognome, dataNascita, codiceFiscale, p);
    }
}

