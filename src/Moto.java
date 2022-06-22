public class Moto extends VeicoloMotore{

    public Moto(String id, String posizione, double tariffa, String targa,PatentiGuida patente) {
        super(id, posizione, tariffa, targa, patente);
    }
    public boolean checkUtente(Utente utente) {
        if (utente.getPatenteGuida().equals(super.getPatenteGuida()) && utente.isCasco()) {
            return true;
        }
        System.out.println("Non hai la patente adeguata a questo veicolo o casco non presente");
        return false;
    }
}
