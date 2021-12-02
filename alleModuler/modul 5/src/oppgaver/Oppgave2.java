package oppgaver;

import javax.swing.*;

class Bøker2{
    public String tittel;
    public double pris;
    public String forfatter;
    public String iSBN_Nummer;

    public void skrivUtAttributter(){
        System.out.println("tittel: " + tittel + "\npris: " + pris + "\nforfatter: " + forfatter + " \niSBN-nummer: " +iSBN_Nummer);
    }
}

public class Oppgave2 {
    public static void main(String[] args) {
        Bøker2 bok = new Bøker2();
        bok.tittel = JOptionPane.showInputDialog("tittel til bok");
        bok.pris = Double.parseDouble(JOptionPane.showInputDialog("pris til bok"));
        bok.forfatter = JOptionPane.showInputDialog("forfatter til bok");
        bok.iSBN_Nummer = JOptionPane.showInputDialog("iSBN-nummer");

        bok.skrivUtAttributter();


    }
}
