import java.util.Scanner;

public class Database {

    public static Utente[] nome = new Utente[5];
    public static Veicolo[] veicolo = new Veicolo[8];
    public static int count = 0;

    public static void testRiempiListe() {
        for (int i = 0; i < nome.length; i++) {
            nome[i] = new Utente("nome" + i, "cognome" + i, "15/01/1988" + i, "NNLL" + 1, "B");
        }
    }

    public static void riempiVeicolo() {
        veicolo[0] = new Automobile("01", "Roma", 0.29, "FF", "B");
        veicolo[1] = new Automobile("02", "Roma", 0.30, "EE", "B");
        veicolo[2] = new Moto("03", "Milano", 0.19, "FV", "A");
        veicolo[3] = new Moto("04", "Torino", 0.17, "AA", "A");
        veicolo[4] = new Furgone("05", "Napoli", 0.35, "FP", "B");
        veicolo[5] = new Furgone("06", "Roma", 0.39, "EF", "B");
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
        System.out.println("Inserire patente di guida: ");
        String patenteGuida = input.nextLine();
        nome[count] = new Utente(name, cognome, dataNascita, codiceFiscale, patenteGuida);
    }

    public static void checkVeicolo() {
        for (int i = 0; i < veicolo.length; i++) {
            if (veicolo[i].isDisponibilita()) {
                System.out.println(veicolo[i]);
            }
        }
    }

    public static void affittaVeicolo(Scanner input, Utente utente) {
        System.out.println("Elenco veicoli disponibili: ");
        checkVeicolo();
        System.out.println("Inserisci id veicolo: ");
        String idVeicolo = input.nextLine();
        for (int i = 0; i < veicolo.length; i++) {
            if (veicolo[i].getId().equals(idVeicolo) && veicolo[i].isDisponibilita() && utente.getCredito() > veicolo[i].getTariffa() * 5) {
                System.out.println("Hai scelto : " + veicolo[i]);
                if (veicolo[i].checkUtente(utente)) {
                    veicolo[i].setDisponibilita(false);
                }
                break;
                //i metodi all'interno delle classi ritornano true, quindi nego il ritorno
            }
        }
    }
}

