import java.time.LocalDateTime;

public class VeicoloMotore extends Veicolo {
    private double carburante;
    private String targa;
    private PatentiGuida patente;

    public VeicoloMotore(String id, String posizione, double tariffa, String targa, PatentiGuida patente) {
        super(id, posizione, tariffa);
        this.carburante = 100;
        this.targa = targa;
        this.patente = patente;
    }

    // Set
    public void setCarburante(double carburante) {
        this.carburante = carburante;
    }
    public void setDisponibilita(boolean disponibilita) {
        if (disponibilita == false) {
            super.setDate(LocalDateTime.now());
        } else {
            this.carburante = 100;
        }
        super.setDisponibilita(disponibilita);
    }

    // Get
    public double getCarburante() {
        return carburante;
    }
    public PatentiGuida getPatenteGuida() {
        return patente;
    }


    @Override
    public String toString() {
        return super.toString() +
                " carburante=" + carburante +
                ", patenteGuida='" + patente + '\'' +
                '}';
    }
}
