package Oppgaver;

public class Oppgave3 {
    public static void main(String[] args) {
        //Gitt følgende string-array : Per, Hansen, Line, Olsen, Ola, Pedersen, Kari, Finnsen.
        //Skriv så ut for og etternavn på flere linjer med en løkke som vist under:
        //
        //Per Hansen
        //Line Olsen
        String[] liste = {"Per","Hansen","Line","Olsen","Ola","Pedersen","Kari","Finnsen", "Leart", "Radoniqi", "Lars", "Pederson"};


        for(int i = 0; i < liste.length; i += 2){
            System.out.println(liste[i] + " " + liste[i + 1]);
        }

    }
}
