import java.util.Scanner;

public class GestioneVeicoli
{
    public static void checkVeicolo() {
        for (int i = 0; i < Database.veicolo.length; i++) {
            if (Database.veicolo[i].isDisponibilita()) {
                System.out.println(Database.veicolo[i]);
            }
        }
    }

    public static void affittaVeicolo(Scanner input, Utente utente) {
        System.out.println("Elenco veicoli disponibili: ");
        checkVeicolo();
        System.out.println("Inserisci id veicolo: ");
        String idVeicolo = input.nextLine();
        for (int i = 0; i < Database.veicolo.length; i++) {
            if (Database.veicolo[i].getId().equals(idVeicolo) && Database.veicolo[i].isDisponibilita() && utente.getCredito() > Database.veicolo[i].getTariffa() * 5) {
                System.out.println("Hai scelto : " + Database.veicolo[i]);
                if (Database.veicolo[i].checkUtente(utente)) {
                    Database.veicolo[i].setDisponibilita(false);
                    utente.setVeicolo(Database.veicolo[i]);
                }
                break;
                //i metodi all'interno delle classi ritornano true, quindi nego il ritorno
            }
        }
    }
}
