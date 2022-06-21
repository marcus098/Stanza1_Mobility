import java.time.LocalDateTime;

public class VeicoloMotore extends Veicolo {
    private double carburante;

    public double getCarburante() {
        return carburante;
    }

    public void setCarburante(double carburante) {
        this.carburante = carburante;
    }

    private String targa, patenteGuida;

    public VeicoloMotore(String id, String posizione, double tariffa, String targa, String patenteGuida) {
        super(id, posizione, tariffa);
        this.carburante = 100;
        this.targa = targa;
        this.patenteGuida = patenteGuida;
    }

    public String getPatenteGuida() {
        return patenteGuida;
    }

    public void setDisponibilita(boolean disponibilita) {
        if (disponibilita == false) {
            super.setDate(LocalDateTime.now());
        } else {
            this.carburante = 100;
        }
        super.setDisponibilita(disponibilita);
    }

    @Override
    public String toString() {
        return super.toString() +
                " carburante=" + carburante +
                ", patenteGuida='" + patenteGuida + '\'' +
                '}';
    }
}
