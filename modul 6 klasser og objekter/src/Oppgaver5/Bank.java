package Oppgaver5;


import javax.swing.*;

public class Bank {
    public static void main(String[] args) {

        /*  Opprett et Konto-objekter, som ved opprettelsen blir tilført
        navn, kontonummer og saldo. */
        String navn = JOptionPane.showInputDialog("Hva er navnet ditt?");
        String kontonummer = JOptionPane.showInputDialog("Hva er kontonummeret ditt?");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Hva er din saldo?"));
        Konto k = new Konto(navn,kontonummer, saldo);

        /*  Test ut ALLE metodene du har laget i Konto-klassen på
        Konto-objektene. Skriv resultatene av metodene ut på System.out.
        Bruk dialogvinduer til både innlesing og utskrift av kontoinformasjon */
        k.kontoutskrift();
        String pengerSattInn = k.settInnPenger(Integer.parseInt(JOptionPane.showInputDialog("Sett inn penger")));
        JOptionPane.showMessageDialog(null, pengerSattInn, "Kontoutskrift", JOptionPane.PLAIN_MESSAGE);

        String pengerTattUt = k.taUtPenger(Integer.parseInt(JOptionPane.showInputDialog("Ta ut penger.")));
        JOptionPane.showMessageDialog(null, pengerTattUt, "Kontoutskrift", JOptionPane.PLAIN_MESSAGE);



    }
}
