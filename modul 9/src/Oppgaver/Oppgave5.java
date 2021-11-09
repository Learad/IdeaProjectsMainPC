package Oppgaver;

public class Oppgave5 {
    public static void main(String[] args) {
        int[]liste = {34,5,8,45,10,2,13,25};
        int størst = liste[0];
        int minst = liste[0];
        for(int i = 1; i < liste.length; i++){
            if(liste[i] > størst){
                størst = liste[i];
            }
            if(liste[i] < minst){
                minst = liste[i];
            }
        }
        System.out.println(størst);
        System.out.println(minst);
    }
}
