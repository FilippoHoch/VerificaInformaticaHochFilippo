package it.castelli.informatica.verificaHochFilippo.es1;
//Importo la classe scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creo un oggetto di tipo scanner
        Scanner tastiera = new Scanner(System.in);
        //Creo 2 oggetti di tipo Preside
        Preside preside1 = new Preside();
        Preside preside2 = new Preside("Tebaldini", "Simonetta", "VHOZTL70P44F280A", 1);
        //Chiedo in input i parametri del primo oggetto
        preside1.setCognome(tastiera.next());
        preside1.setNome(tastiera.next());
        preside1.setCodiceFiscale(tastiera.next());
        preside1.setNumeroMatricola(tastiera.nextInt());
        //Richiamo i metodi
        System.out.println(preside1.contaVocali());
        System.out.println(preside1.contaPari());
        System.out.println(preside2.contaVocali());
        System.out.println(preside2.contaPari());
        System.out.println(preside1.toString());
        System.out.println(preside2.toString());
    }
}
