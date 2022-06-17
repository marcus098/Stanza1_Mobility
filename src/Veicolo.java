public class Veicolo {
    private String id;
    private double tariffa;
    private String posizione;
    private boolean disponibilita;

    public Veicolo(String id, double tariffa, String posizione){
        this.id = id;
        setTariffa(tariffa);
        this.posizione = posizione;
    }

    public void setDisponibilita(boolean disponibilita) {
        this.disponibilita = disponibilita;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }
    public void setTariffa(double tariffa) {
        if(tariffa>0)
            this.tariffa = tariffa;
        else
            System.out.println("Importo errato");
    }
    public double getTariffa() {
        return tariffa;
    }
    public String getId() {
        return id;
    }
    public String getPosizione() {
        return posizione;
    }


}
