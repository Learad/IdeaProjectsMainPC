package oppgaver;

import javax.swing.*;

class Person2{
    public String navn;
    public String adresse;
    public String telefonnr;
    public int fødselsår;

    public int alder(){
        int alder = 2021 - fødselsår;
        return alder;
    }

    public void skrivUtData(int alder){
        System.out.println(navn +" med adresse " + adresse + " med telefonnummer " + telefonnr + " er " + alder
                + " år.");

    }

}

public class Oppgave4 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        person.navn = JOptionPane.showInputDialog("navn?");
        person.telefonnr = JOptionPane.showInputDialog("tlf?");
        person.adresse = JOptionPane.showInputDialog("adresse?");
        person.fødselsår = Integer.parseInt(JOptionPane.showInputDialog("fødselsår?"));

        int alder = person.alder();
        person.skrivUtData(alder);
    }
}
