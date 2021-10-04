package Oblig;

import javax.swing.*;

public class Sirkel {
    public static void main(String[] args) {

        String innRadius = JOptionPane.showInputDialog("Skriv inn radius");
        double radius = Double.parseDouble(innRadius);
        double diameter = radius*2;
        double omkrets = Math.PI*2*radius;
        double areal = Math.PI*Math.pow(radius, 2);

        String diameterDesimal = String.format("%.2f" , diameter);
        String omkretsDesimal = String.format("%.2f" , omkrets);
        String arealDesimal = String.format("%.2f" , areal);


        System.out.println("Diameteren av en sirkel med " + radius + " som radius er " + diameterDesimal + " cm" + "\n"
                         + "Omkretsen av en sirkel med " + radius + " som radius er " + omkretsDesimal + " cm" + "\n"
                         + "Arealet av sirkel med " + radius + " som radius er "+ arealDesimal +" cm");


    }
}
