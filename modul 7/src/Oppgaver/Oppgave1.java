package Oppgaver;

import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args) {
        String helTall = JOptionPane.showInputDialog("Skriv inn et tall");
        int alder = Integer.parseInt(helTall);
        if(alder >= 18 && alder < 20){
            System.out.println("Du er myndig men kan ikke kjøpe alkohol med mindre enn 22% på polet.");
        }else {
            System.out.println("Du er enten umyndig eller du kan kjøpe hva du vil på polet");
        }
    }
}
