public class Veicolo {
    private String id, posizione;
    private double tariffa;

    //disponibilita intendo veicolo libero o occupato
    private boolean disponibilita;

    public Veicolo(String id, String posizione, double tariffa) {
        this.id = id;
        this.posizione = posizione;
        this.tariffa = tariffa;
        this.disponibilita = true;
        setTariffa(tariffa);
        /*if(tariffa > 0){
            this.tariffa = tariffa;
        }
        else{
            System.out.println("Importo negativo");
        }*/
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDisponibilita(boolean disponibilita) {
        this.disponibilita = disponibilita;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }

    public void setTariffa(double tariffa) {
        this.tariffa = tariffa;
        if (tariffa > 0) {
            this.tariffa = tariffa;
        } else {
            System.out.println("Importo negativo");
        }
    }

    public boolean isDisponibilita() {
        return disponibilita;
    }

    public double getTariffa() {
        return tariffa;
    }

    public String getPosizione() {
        return posizione;
    }

    public String getId() {
        return id;
    }
    public boolean checkUtente(Utente utente){
        return true;
    }
    //Fare controllo del check saldo!

}
