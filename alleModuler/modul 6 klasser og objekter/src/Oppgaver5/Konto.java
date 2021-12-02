package Oppgaver5;

import javax.swing.*;

public class Konto {
    //  Attributtene for kontoinnehavers navn, kontonummer og saldo.
    private String navn;
    private String kontonummer;
    private double saldo;

    //  Kontruktør som skal gi startverdier til ALLE attributtene
    public Konto(String navn, String kontornummer, double saldo){
        this.navn = navn;
        this.kontonummer = kontornummer;
        this.saldo = saldo;
    }

    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */
    public void kontoutskrift(){
        String visKonto = "eier: " + navn + "\nkonto: " + kontonummer + "\nsaldo: " + saldo;
        JOptionPane.showMessageDialog(null, visKonto, "Kontoutskrift", JOptionPane.PLAIN_MESSAGE);
    }

    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */
    public String settInnPenger(double innBeløp){
        double nyttBeløp = saldo + innBeløp;
        String nySaldo = "Din nye saldo er: " +nyttBeløp;

        return nySaldo;
    }

    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */
    public String taUtPenger(double utBeløp){
        String tilbakemelding = "";
        if(saldo >= utBeløp){
            double nyttBeløp = saldo - utBeløp;
            tilbakemelding = "Du har tatt ut: " + utBeløp + "\nDin nye saldo er: " + nyttBeløp;
        } else{
            tilbakemelding = "Det er ikke dekning for å ta ut beløpet.";
        }
        return tilbakemelding;
    }
}   //  end of class konto
