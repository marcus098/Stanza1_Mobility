public class VeicoloMotore extends Veicolo {
    private double carburante;
    private String targa, patenteGuida;

    public VeicoloMotore(String id, String posizione, String targa, double tariffa, String patenteGuida) {
        super(id, tariffa, posizione);
        this.targa = targa;
        this.patenteGuida = patenteGuida;
        carburante = 100;
    }
}
