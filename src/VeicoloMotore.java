import java.time.LocalDateTime;

public class VeicoloMotore extends Veicolo implements Alimentazione {
    private int alimentazione;
    private String targa;
    private PatentiGuida patente;



    public VeicoloMotore(String id, String posizione, double tariffa, String targa, PatentiGuida patente) {
        super(id, posizione, tariffa);
        this.alimentazione = 100;
        this.targa = targa;
        this.patente = patente;
    }

    // Set
    public void setDisponibilita(boolean disponibilita) {
        if (disponibilita == false) {
            super.setDate(LocalDateTime.now());
        } else {
            this.alimentazione = 100;
        }
        super.setDisponibilita(disponibilita);
    }
    @Override
    public void setAlimentazione(int alimentazione)
    {
        this.alimentazione = alimentazione;
    }

    // Get
    public int getAlimentazione() {
        return alimentazione;
    }
    public PatentiGuida getPatenteGuida() {
        return patente;
    }


    @Override
    public String toString() {
        return super.toString() +
                " carburante=" + alimentazione +
                ", patenteGuida='" + patente + '\'' +
                '}';
    }
}
