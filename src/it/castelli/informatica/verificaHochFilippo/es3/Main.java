package it.castelli.informatica.verificaHochFilippo.es3;
//Importo la classe scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creo un oggetto di tipo scanner
        Scanner tastiera = new Scanner(System.in);
        Meteo meteo = new Meteo();
        int punteggioP=0;
        int punteggioC=0;
        int Turn;
        String chose;
        int tempChose;
        System.out.println("Quante partite vuoi fare?: ");
        Turn = tastiera.nextInt();

        for(int i=0; i<Turn; i++){
            do{
                System.out.println("scegli la mossa (vento = 1, sole = 2 o nuvola = 3): ");
                tempChose = tastiera.nextInt();
            }while(tempChose!=1&&tempChose!=2&&tempChose!=3);
            if (tempChose == 1){
                chose = "vento";
            }
            else  if(tempChose ==2){
                chose = "sole";
            }
            else {
                chose="nuvola";
            }
            meteo.prevedi();
            System.out.println("L'avversario ha scelto "+ meteo.getPrevisione());
            if (meteo.getPrevisione()==chose){
                System.out.println("Pari");
            }
            else if (meteo.getPrevisione()=="sole"&&chose=="nuvola"){
                System.out.println("Ha vinto il computer");
                punteggioC++;
            }
            else if (meteo.getPrevisione()=="nuvola"&&chose=="sole"){
                System.out.println("Hai vinto tu");
                punteggioP++;
            }
            else if (meteo.getPrevisione()=="sole"&&chose=="vento"){
                System.out.println("Hai vinto tu");
                punteggioP++;
            }
            else if (meteo.getPrevisione()=="vento"&&chose=="sole"){
                System.out.println("Ha vinto il computer");
                punteggioC++;
            }
            else if (meteo.getPrevisione()=="nuvola"&&chose=="vento"){
                System.out.println("Ha vinto il computer");
                punteggioC++;
            }
            else if (meteo.getPrevisione()=="vento"&&chose=="nuvola"){
                System.out.println("Hai vinto tu");
                punteggioP++;
            }
        }
        System.out.print("Il vincitore ");
        if (punteggioP>punteggioC){
            System.out.println("sei tu");
        }
        else {
            System.out.println("è il computer");
        }
    }
}
