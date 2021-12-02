package Oppgaver;
import java.util.Arrays;

class Trekning{
    public int[] vinnere(){
        int[] vinnerTall = new int[7];
        /*for (int i = 0; i < vinnerTall.length; i++) {
            vinnerTall[i]=((int) (Math.random() * 34 + 1));
        }*/
        int i=0;
        while (i<7) {
            int random = (int) (Math.random() * 34 + 1);
            boolean funnet = false;
            for (int j=0; j<7; j++) {
                if (vinnerTall[j] == random) {
                    funnet = true;
                }
            }
            if (!funnet){
                vinnerTall[i] =random;
                i++;
            }
        }
        Arrays.sort(vinnerTall);
        return vinnerTall;
    }
}

public class E19Oppg2 {
    public static void main(String[] args) {
        /*Det skal lages en "Lottogenerator". Denne skal generere 7 vinnertall mellom 1 og 34.
        Vinnertallene skal sorteres fra minste til største tallet og skrives ut på System.out.
                Lag en egen klasse kalt Trekning. Denne klassen skal inneholde en metode som
        kalles vinnere. Denne metoden skal ikke ta noen parametere inn, men returnere et
        heltallsarray med de 7 vinnertallene sortert.
        Bruk f.eks*/
                //(int )(Math.random() * 34 + 1);
        //for å generere et randomisert tall mellom 1 og 34 og
        //Arrays.sort(vinnere);    // er en del av java.util.Arrays
        /*for å sortere vinner-arrayet før det returneres.
                Lag også en main-metode som oppretter et trekningsobjekt, kaller metoden vinnere
        og skriver ut resultatet av arrayet i System.out.*/

        Trekning trekning = new Trekning();
        int[] vinnere = trekning.vinnere();

        for (int tall : vinnere){
            System.out.println(tall);
        }


    }
}
