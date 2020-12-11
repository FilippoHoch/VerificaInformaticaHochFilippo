package it.castelli.informatica.verificaHochFilippo.es2;
//Importo la classe scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creo un oggetto di tipo scanner
        Scanner tastiera = new Scanner(System.in);
        FerroDaStiro ferroDaStiro = new FerroDaStiro();
        ferroDaStiro.setCounter(tastiera.nextInt());
        int chose;
        do{
            System.out.println("Per vedere lo stato del ferro da stiro scirvere 1"+ '\n' +"Per cambiare lo stato premere 2" +'\n' +"Per chiudere il programma scrivere un qualsiasi altro numero");
            chose = tastiera.nextInt();
            switch (chose){
                case 1:
                   System.out.println(ferroDaStiro.toString());
                    break;
                case 2:
                    ferroDaStiro.click();
                    break;
                default:
                    System.out.println("Programma terminato");
                    break;
            }
        }while(chose!=3);

    }
}
