import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Database.testRiempiListe();
        Database.nome[0].setCredito(10);
        Database.riempiVeicolo();
        GestioneVeicoli.checkVeicolo();
        GestioneVeicoli.affittaVeicolo(input, Database.nome[0]);
        GestioneVeicoli.checkVeicolo();
        System.out.println(Database.nome[0]);
        System.out.println("*************");
        Database.nome[0].restituzioneVeicolo();
        System.out.println(Database.nome[0]);
        System.out.println();
//        Database.aggiungiUtente(input);
//        Database.aggiungiUtente(input);
//        System.out.println(Arrays.toString(Database.nome));
    }
}


