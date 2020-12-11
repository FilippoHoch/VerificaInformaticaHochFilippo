package it.castelli.informatica.verificaHochFilippo.es3;


public class Meteo {
    //Attributi
    private String previsione;
    //Costruttori
    public Meteo(){}
    public Meteo(String previsione){
        this.previsione=previsione;
    }
    //Getter e Setter

    public String getPrevisione() {
        return previsione;
    }

    public void setPrevisione(String previsione) {
        this.previsione = previsione;
    }

    //Metodi
    public void prevedi(){
        int tempPrevisione = (int)(Math.random()*3);
        if (tempPrevisione==1){
            previsione="vento";
        }
        else if(tempPrevisione==2){
            previsione="sole";
        }
        else{
            previsione="nuvola";
        }
    }

    public String toString() {
        return "Meteo{" +
                "previsione='" + previsione + '\'' +
                '}';
    }
}
