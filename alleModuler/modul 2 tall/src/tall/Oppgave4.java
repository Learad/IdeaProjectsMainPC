package tall;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4 {
    public static void main (String [] args){
        String innTall1 = showInputDialog("Skriv inn et tall");
        String innTall2 = showInputDialog("Skriv inn et tall til");
        String innTall3 = showInputDialog("Skriv inn et siste tall");
        double tall1,tall2,tall3;
        try{
            tall1 = Double.parseDouble(innTall1);
            tall2 = Double.parseDouble(innTall2);
            tall3 = Double.parseDouble(innTall3);
        }
        catch(Exception e){
            tall1=0;
            tall2=0;
            tall3=0;
        }
        double sum = tall1 + tall2 + tall3;
        double gjennomsnitt = sum / 3;
        System.out.println("summen av tallene "+tall1+", "+tall2+", "+tall3+" er "+sum);
        System.out.println("Gjennomsnittet er "+ gjennomsnitt);

    }


}
