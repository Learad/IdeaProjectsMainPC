package Oppgaver;

import javax.swing.*;

public class Oppgave3 {
    public static void main(String[] args) {
        String innAlder = JOptionPane.showInputDialog("Skriv inn alder");
        int alder = Integer.parseInt(innAlder);
        if (alder >= 18){
            System.out.println("Du er gammel nok til å ta lappen");
        } else {
            System.out.println("Du er ikke gammel nok til å ta lappen");
        }
    }
}
