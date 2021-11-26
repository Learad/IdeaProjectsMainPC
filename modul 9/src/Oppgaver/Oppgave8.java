package Oppgaver;

import javax.swing.*;

public class Oppgave8 {
    public static void main(String[] args) {
        /*
        Det skal lages et program som beregner gjennomsnittlig poengsummer for et antall elever
        - poengene er mellom 0 og 100.
        Lag et program som først leser inn hvor mange poengsummer som skal leses inn.
        Så skal det opprettes et heltalls-array med riktig lengde (fra input).
        Deretter skal det leses inn poengsummer via en løkke samtidig som arrayet fylles.
        Tilslutt skal det via en løkke beregnes gjennomsnittlig poengsum også vise dette på skjermen.
        (Det er mulig å løse denne oppgaven enklere uten å bruke array, men oppgaven trener på bruk av arrays).
        Bruk gjerne try/catch ved parsing av input og spør igjen om tall dersom det ikke er oppgitt riktig.
        */

        int antallEleverLengde =Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall elever"));
        int[] antallElever = new int[antallEleverLengde];

        for (int i = 0; i < antallElever.length; i++){
            int poengsum = Integer.parseInt(JOptionPane.showInputDialog("Hva er poengsum til elev nr." + (i+1)));
            if (poengsum <= 100 && poengsum >= 0){
                antallElever[i] = poengsum;
            }else{
                System.out.println("Ugyldig poengsum skrevet inn for elev nr." + (i+1) + ", poengsummen blir satt til 0");
                antallElever[i] = 0;
            }
        }
        int sum = 0;
        for (int i = 0; i < antallElever.length; i++){
            sum += antallElever[i];
        }
        System.out.println("Gjennomsnittlig poengsum: " + sum/antallEleverLengde);
    }
}
