package Oppgaver;

public class E19Oppg1b {
    public static void main(String[] args) {
        int i = 0;
        int teller = 0;
        int sum = 0;
        while (i <= 100){
            teller++;
            sum += i;
            i+=2;
        }
        int gjennomsnitt = sum/teller;
        System.out.println(gjennomsnitt);
    }
}
