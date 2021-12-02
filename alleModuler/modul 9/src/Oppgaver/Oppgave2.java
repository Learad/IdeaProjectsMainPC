package Oppgaver;

public class Oppgave2 {
    public static void main(String[] args) {

        //Bruk arrayet i oppgave 1.
        //Summer alle tallene med en for-løkke.
        //Finn så gjennomsnittet av alle tallene.
        //Summer så alle tallene som er større enn 5.
        //Finn så gjennomsnittet av disse.
        //Summer så tallene med en forenklet for-løkke.

        int[] liste = new int[9];
        liste[0] = 1;
        liste[1] = 24;
        liste[2] = 3;
        liste[3] = 32;
        liste[4] = 5;
        liste[5] = 62;
        liste[6] = 7;
        liste[7] = 83;
        liste[8] = 9;

        int sum = 0;
        int teller = 0;
        for (int i = 0; i <= 8; i++){
            sum += liste[i];
            teller++;
        }
        System.out.println(sum);
        System.out.println(sum/teller);

        sum = 0;
        teller = 0;
        for (int i = 0; i <= 8; i++){
            if(liste[i]>5){
                sum += liste[i];
                teller++;
            }
        }
        System.out.println(sum);
        System.out.println(sum/teller);

        sum = 0;

        for (int i: liste){
            sum += i;
        }
        System.out.println(sum);
    }
}
