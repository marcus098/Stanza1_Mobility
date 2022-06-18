public class VeicoloMotore extends Veicolo {
    private double carburante;
    private String targa, patenteGuida;

    public VeicoloMotore(String id, String posizione, double tariffa, String targa, String patenteGuida) {
        super(id, posizione, tariffa);
        this.carburante = 100;
        this.targa = targa;
        this.patenteGuida = patenteGuida;
    }

}
