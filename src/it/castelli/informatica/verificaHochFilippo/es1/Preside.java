package it.castelli.informatica.verificaHochFilippo.es1;

public class Preside {
    //Attributi
    private String cognome;
    private String nome;
    private String codiceFiscale;
    private int numeroMatricola;
    //Costruttori
    public Preside(){}
    public Preside(String cognome, String nome, String codiceFiscale, int numeroMatricola){
        this.cognome=cognome;
        this.nome=nome;
        this.codiceFiscale=codiceFiscale;
        this.numeroMatricola=numeroMatricola;
    }

    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public int getNumeroMatricola() {
        return numeroMatricola;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNumeroMatricola(int numeroMatricola) {
        this.numeroMatricola = numeroMatricola;
    }

    //Metodi
    public int contaVocali(){
        int conta=0;
        for (int i=0; i<codiceFiscale.length(); i++){
            if (codiceFiscale.charAt(i)=='A'||codiceFiscale.charAt(i)=='E'||codiceFiscale.charAt(i)=='I'||codiceFiscale.charAt(i)=='O'||codiceFiscale.charAt(i)=='U'){
                conta++;
            }
        }
        return conta;
    }
    public int contaPari(){
        int conta=0;
        for (int i=0; numeroMatricola>0; i++){
            //Ho considerato lo 0 come pari
            if((numeroMatricola%10)%2==0){
                conta++;
            }
            numeroMatricola=numeroMatricola/10;
        }
        return conta;
    }

    public String toString() {
        return "Preside{" +
                "cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", numeroMatricola=" + numeroMatricola +
                '}';
    }
}
