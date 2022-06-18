public class Veicolo {
    private String id, posizione;
    private double tariffa;
    //disponibilita intendo veicolo libero o occupato
    private boolean disponibilita;

    public Veicolo(String id, String posizione, double tariffa) {
        this.id = id;
        this.posizione = posizione;
        this.tariffa = tariffa;
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
}
