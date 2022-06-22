public class Monopattino extends Veicolo implements Alimentazione {
    private int alimentazione;

    public Monopattino(String id, String posizione, double tariffa) {
        super(id, posizione, tariffa);
        this.alimentazione = 100;
    }
    @Override
    public void setAlimentazione(int alimentazione) {

    }
    @Override
    public int getAlimentazione() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Alimentazione =" + alimentazione
                ;
    }
}
