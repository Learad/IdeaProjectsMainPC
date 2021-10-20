package Oppgaver;

import javax.swing.*;

class Person{
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public Person(String fornavn, String etternavn, String adresse, String telefonnr){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }
    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public void skrivUt(){
        String utMelding = "Fornavn = " + fornavn + "\nEtternavn = " + etternavn + "\nAdresse = " + adresse + "\nTelefonnr = " + telefonnr;
        JOptionPane.showMessageDialog(null, utMelding, "Utskrift", JOptionPane.PLAIN_MESSAGE);
    }
}

public class Oppgave1 {
    public static void main(String[] args) {
        String fornavn = JOptionPane.showInputDialog("Hva er navnet ditt?");
        String etternavn = JOptionPane.showInputDialog("Hva er etternavnet ditt?");
        String adresse = JOptionPane.showInputDialog("Hva er adressen din?");
        String telefonnr = JOptionPane.showInputDialog("Hva er TLF ditt?");
        Person p = new Person(fornavn, etternavn, adresse, telefonnr);

        p.skrivUt();





    }
}
