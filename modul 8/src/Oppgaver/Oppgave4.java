package Oppgaver;

public class Oppgave4 {
    public static void main(String[] args) {
        int sum = 0;
        int teller = 0;
        for(int i = 0; i < 100; i+=2) {
            sum += i;
            teller ++;
        }
        System.out.println(sum);
        System.out.println("Gjennomsnitt: " +sum/teller);
    }
}
