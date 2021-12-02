package variables;

import javax.swing.*;

public class Oppg1 {
    public static void main(String [] args){
        String navn = JOptionPane.showInputDialog("hva er navnet ditt?");
        String innAlder = JOptionPane.showInputDialog("hvor gammel er du i løpet av dette året?");
        int alder = Integer.parseInt(innAlder);
        int fødselsår = 2021 - alder;
        int pensjonsår = fødselsår + 67;

        System.out.println();


    }
}