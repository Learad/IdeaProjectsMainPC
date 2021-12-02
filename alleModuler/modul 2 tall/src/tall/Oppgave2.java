package tall;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    public static void main(String [] args){
        String innstreng1 = showInputDialog("Skriv inn et tall");
        String innstreng2 = showInputDialog("Skriv inn et tall til");
        String innstreng3 = showInputDialog("Skriv inn et siste tall");
        double desimaltall1 = Double.parseDouble(innstreng1);
        double desimaltall2 = Double.parseDouble(innstreng2);
        double desimaltall3 = Double.parseDouble(innstreng3);
        double sum = desimaltall1 + desimaltall2+ desimaltall3;
        double gjennomsnitt = sum / 3;

        System.out.println("Summen av tallene blir "+sum);
        System.out.println("Summen av tallene blir "+gjennomsnitt);



    }
}
