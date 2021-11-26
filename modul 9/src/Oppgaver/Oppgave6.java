package Oppgaver;

public class Oppgave6 {
    public static void main(String[] args) {

        //Lag et program som sjekker om to heltalls-arrays er like. Bruk løkker, ikke innebygd java klasse/metode.

        //Lengden på arrayene må være like
        //Sjekke om hvert enkelt element tilsvarer samme element i andre rekke
        int[]array = {45,34,5,8,10,2,13,25};
        int[]array2 = {45,34,5,8,10,2,13,25};

        String output = "Arrayene er like";

        if(array.length != array2.length){
            output = "Arrayene er ikke like, fordi lengdene er ulike";
        }else{
            for (int i = 0; i < array.length; i++){
                if (array[i] != array2[i]){
                    output = "Arrayene er ikke like";
                }
            }
        }
        System.out.println(output);
    }
}
