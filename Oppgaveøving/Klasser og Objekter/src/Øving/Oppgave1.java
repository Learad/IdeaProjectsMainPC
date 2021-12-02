package Øving;

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
    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getFornavn(){
        return fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getAdresse(){
        return adresse;
    }
    public void setTelefonnr(String telefonnr){
        this.telefonnr = telefonnr;
    }
    public String getTelefonnr(){
        return telefonnr;
    }

    public void skrivUt(){
        String ut = "Navn: " + fornavn + " " + etternavn + "\nAdresse: " + adresse + "\ntelefonnr: " + telefonnr;
        JOptionPane.showMessageDialog(null, ut);
    }

}



public class Oppgave1 {
    public static void main(String[] args) {
        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavn");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavn");
        String adresse = JOptionPane.showInputDialog("Skriv inn adresse");
        String telefonnr = JOptionPane.showInputDialog("Skriv inn telefonnr");
        Person p = new Person(fornavn, etternavn, adresse, telefonnr);
        p.skrivUt();



    }
}
