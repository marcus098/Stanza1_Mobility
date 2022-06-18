public class Bicicletta extends Veicolo{

    public Bicicletta(String id, String posizione, double tariffa) {
        super(id, posizione, tariffa);
    }
    public boolean checkUtente(Utente utente) {
        if (utente.isCasco()) {
            return true;
        }
        return false;
    }
}
