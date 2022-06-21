import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Database.aggiungiUtente(input);
        Database.nome[0].setCredito(10);
        Database.riempiVeicolo();
        Database.affittaVeicolo(input, Database.nome[0]);
        Database.checkVeicolo();

        System.out.println();
    }
}


