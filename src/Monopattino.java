public class Monopattino extends Veicolo {
    private double carburante;

    public Monopattino(String id, String posizione, double tariffa) {
        super(id, posizione, tariffa);
        this.carburante = 100;
    }
}
