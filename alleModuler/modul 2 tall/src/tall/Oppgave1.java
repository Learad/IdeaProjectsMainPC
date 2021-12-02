package tall;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1 {
    public static void main(String [] args){
        String innStreng1 = JOptionPane.showInputDialog("hva er alderen din?");
        int alder = Integer.parseInt(innStreng1);
        System.out.println("Din alder er "+alder+" år");
    }

}
