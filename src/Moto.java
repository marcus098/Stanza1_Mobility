public class Moto extends VeicoloMotore{

    public Moto(String id, String posizione, double tariffa, String targa, String patenteGuida) {
        super(id, posizione, tariffa, targa, patenteGuida);
    }
    public boolean checkUtente(Utente utente) {
        if (utente.getPatenteGuida().equals(super.getPatenteGuida()) && utente.isCasco()) {
            return true;
        }
        return false;
    }
}
