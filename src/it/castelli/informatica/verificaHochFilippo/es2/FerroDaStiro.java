package it.castelli.informatica.verificaHochFilippo.es2;

public class FerroDaStiro {
    //Attributi
    private String state;
    private int counter;

    //Costruttori
    public FerroDaStiro(){}
    public FerroDaStiro(String state){
        this.state=state;
    }

    //Getter e Setter

    public String getState() {
        return state;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    //Metodi

    public String toString() {
        return "FerroDaStiro{" +
                "state='" + state + '\'' +
                '}';
    }
    public void click(){
        if (state=="acceso" && counter!=0){
            state = "spento";
        }
        else if (state == "spento" && counter!=0){
            state = "acceso";
        }
        else{
            state="rotto";
            System.out.println("Il ferro da stiro è rotto");
            return;
        }
        System.out.println("lo stato è diventato " + state);
        counter = counter -1;
    }
}
