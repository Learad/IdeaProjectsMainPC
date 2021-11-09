package Oppgaver;

public class Oppgave8 {
    public static void main(String[] args) {
        int i = 0;
        int teller = 0;
        int sum = 0;
        while(i < 100){
            sum += i;
            teller ++;
            i += 2;
        }
        System.out.println(sum);
        System.out.println(sum/teller);
    }
}
