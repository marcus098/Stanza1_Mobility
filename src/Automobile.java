public class Automobile extends VeicoloMotore {

    public Automobile(String id, String posizione, double tariffa, String targa, String patenteGuida) {
        super(id, posizione, tariffa, targa, patenteGuida);
    }

    public boolean checkUtente(Utente utente) {
        if (utente.getPatenteGuida().equals(super.getPatenteGuida())) {
            return true;
        }
        return false;
    }
}
