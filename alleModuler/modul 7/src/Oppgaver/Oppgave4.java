package Oppgaver;

import static javax.swing.JOptionPane.*;

public class Oppgave4 {
    public static void main(String[] args) {
        int alder = Integer.parseInt(showInputDialog("Skriv inn alder"));
        if(alder <=18){
            System.out.println("Du kan ikke ta lappen");
        }else if (alder >= 18 && alder < 70){
            System.out.println("Du kan ta lappen");
        }else{
            System.out.println("Du kan ta lappen men trenger årlig legesjekk for å kjøre bil.");
        }
    }
}
