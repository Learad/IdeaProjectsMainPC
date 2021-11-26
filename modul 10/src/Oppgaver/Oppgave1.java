package Oppgaver;

import java.util.ArrayList;

public class Oppgave1 {
    public static void main(String[] args) {
        ArrayList<Integer> tall = new ArrayList<Integer>();

        tall.add(1);
        tall.add(2);
        tall.add(3);
        tall.add(4);
        tall.add(5);
        tall.add(6);
        tall.add(7);
        tall.add(8);
        tall.add(9);

        System.out.println(tall.get(2));
        System.out.println(tall.get(5));
    }
}
