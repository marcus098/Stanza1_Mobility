public class Utente {
    private String nome, cognome, dataNascita, codiceFiscale, patenteGuida ,idUtente;
    private boolean casco;
    private double credito;

    private  Veicolo veicolo;

    public Utente(String nome , String cognome , String dataNascita, String codiceFiscale , String patenteGuida){
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.codiceFiscale = codiceFiscale;
        this.patenteGuida = patenteGuida;
        idUtente = Database.count + " ";
        Database.count++;
        this.veicolo = null;
    }

    //Setter
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public void setDataNascita(String dataNascita){
        this.dataNascita = dataNascita;
    }

    public void setPatenteGuida(String patenteGuida){
        this.patenteGuida = patenteGuida;
    }
    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String getNome() {
        return nome;
    }
    //Getter
    public String getCognome() {
        return cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public String getPatenteGuida() {
        return patenteGuida;
    }

    public double getCredito() {
        return credito;
    }

    public String getIdUtente() {
        return idUtente;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public boolean isCasco() {
        return casco;
    }

}
