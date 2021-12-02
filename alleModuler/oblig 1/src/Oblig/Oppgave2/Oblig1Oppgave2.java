package Oblig.Oppgave2;

import javax.swing.*;

public class Oblig1Oppgave2 {
    public static void main(String [] args){
        // les inn navn, antall og pris for vare 1
        String navn = JOptionPane.showInputDialog("Skriv inn navn for vare 1");
        String innAntall = JOptionPane.showInputDialog("Skriv inn antall av vare 1");
        String innPris = JOptionPane.showInputDialog("Skriv inn pris for vare 1");

        // les inn navn, antall og pris for vare 2
        String navn2 = JOptionPane.showInputDialog("Skriv inn navn for vare 2");
        String innAntall2 = JOptionPane.showInputDialog("Skriv inn antall av vare 2");
        String innPris2 = JOptionPane.showInputDialog("Skriv inn pris av vare 2");

        // bruk avvikshåntering (try/catch) for å konvertere
        // antall og pris for vare 1 og vare 2
        int antall = 0;
        double pris = 0;
        int antall2 = 0;
        double pris2 = 0;

        try {
            antall = Integer.parseInt(innAntall);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Du har skrevet et ugyldig tall for antall i vare 1", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try{
            pris = Double.parseDouble(innPris);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Du har skrevet et ugyldig tall for pris i vare 1", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try{
            antall2 = Integer.parseInt(innAntall2);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Du har skrevet et ugyldig tall for antall i vare 2", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try{
            pris2 = Double.parseDouble(innPris2);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Du har skrevet et ugyldig tall for pris i vare 2", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // opprett to vare-objekter med de innleste verdiene
        Vare vare1 = new Vare(navn, antall, pris);
        Vare vare2 = new Vare(navn2, antall2, pris2);

        // beregn og skriv ut total pris for alle varer i System.out
        System.out.println(vare1.getNavn()+ " Har totalkostnad på " + vare1.totalPris());
        System.out.println(vare2.getNavn()+ " Har totalkostnad på " + vare2.totalPris());

    }
}
