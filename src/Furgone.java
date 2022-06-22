
public class Furgone extends VeicoloMotore {

    public Furgone(String id, String posizione, double tariffa, String targa, PatentiGuida patente) {
        super(id, posizione, tariffa, targa, patente);
    }
    public boolean checkUtente(Utente utente) {
        if (utente.getPatenteGuida().equals(super.getPatenteGuida())) {
            return true;
        }
        System.out.println("Non hai la patente adeguata a questo veicolo");
        return false;
    }
}