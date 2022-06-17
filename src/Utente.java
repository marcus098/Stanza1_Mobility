public class Utente {
    private String nome, cognome, dataNascita, codiceFiscale, patenteGuida;
    private boolean casco;
    private double credito;
    private String idUtente;

    public Utente(String nome, String cognome, String dataNascita, String codiceFiscale, String patenteGuida){
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.codiceFiscale = codiceFiscale;
    }
}
