package Oppgaver;

import static javax.swing.JOptionPane.*;

public class Oppgave5a {
    public static void main(String[] args) {
        String month = showInputDialog("Skriv inn måned(små bokstaver)");
        if(month.equals("juni") || month.equals("juli") || month.equals("august")){
            System.out.println("Det er sommer");
        }else if(month.equals("september") || month.equals("oktober") || month.equals("november")){
            System.out.println("Det er høst");
        }else if(month.equals("desember") || month.equals("januar") || month.equals("februar")){
            System.out.println("Det er vinter");
        }else if(month.equals("mars") || month.equals("april") || month.equals("mai")){
            System.out.println("Det er vår");
        }else{
            System.out.println("Dette er ikke en måned, eller du har glemt å skrive med små bokstaver");
        }
    }
}
