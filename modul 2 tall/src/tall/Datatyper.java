package tall;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Datatyper {
    public static void main(String [] args){
        String innStreng1 = showInputDialog("Skriv inn et heltall.");
        String innStreng2 = showInputDialog("Skriv inn et desimaltall å dele på.");
        int innTall1 = Integer.parseInt(innStreng1);
        double innTall2 = Double.parseDouble(innStreng2);
        double divisjon = innTall1 / innTall2;
        String out = "Divisjon "+innTall1+" delt på "+innTall2+" er "+divisjon;


        showMessageDialog(null, out);


    }
}
