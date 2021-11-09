package Oblig.Oppgave1;

import javax.swing.*;


public class Oblig1Oppgave1 {
     public static void main(String[] args) {
         //  Sett en variabel lik en verdi for radius
         String innRadius = JOptionPane.showInputDialog("Skriv inn radius");
         double radius = Double.parseDouble(innRadius);

    /* Kall så de statiske metodene i sirkel-klassen for å vise følgende på
       System.out (gitt radius lik 23.5)

       Arealet av sirkelen med radius 23.5 er 1734,94
       Omkretsen av sirkelen med radius 23.5 er 147,65
       Diameteren til sirkelen er med radius 23.5 er 47,00

       Tips : String.format("%.2f",desimalverdi); for å formatere to desimaler
    */
         String diameterDesimal = String.format("%.2f", Sirkel.sirkelDiameter(radius));
         String omkretsDesimal = String.format("%.2f", Sirkel.sirkelOmkrets(radius));
         String arealDesimal = String.format("%.2f", Sirkel.sirkelAreal(radius));


         System.out.println("Diameteren av en sirkel med " + radius + " som radius er " + diameterDesimal + " cm" + "\n"
                 + "Omkretsen av en sirkel med " + radius + " som radius er " + omkretsDesimal + " cm" + "\n"
                 + "Arealet av sirkel med " + radius + " som radius er " + arealDesimal + " cm");
     }
}
