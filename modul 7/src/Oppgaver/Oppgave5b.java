package Oppgaver;

import static javax.swing.JOptionPane.*;

public class Oppgave5b {
    public static void main(String[] args) {
        String month = showInputDialog("Skriv inn måned(små bokstaver)");
        switch (month){
            case "juni":
            case "juli":
            case "august":
                System.out.println("Det er sommer");
                break;
            case "september":
            case "oktober":
            case "november":
                System.out.println("Det er høst");
                break;
            case "desember":
            case "januar":
            case "februar":
                System.out.println("Det er vinter");
                break;
            case "mars":
            case "april":
            case "mai":
                System.out.println("Det er vår");
                break;
            default:
                showMessageDialog(null,"feil i input, ikke gyldig måned","Error", ERROR_MESSAGE);
                break;



        }
    }
}
