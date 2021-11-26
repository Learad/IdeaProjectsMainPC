package Oppgaver;

import java.util.ArrayList;

public class Oppgave4 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 1; i <= 9; i++){
            array.add(i);
        }

        int[] array2 = new int[9];

        for (int i = 0; i < array.size(); i++){
            array2[i] = array.get(i);
            System.out.println(array2[i]);
        }


    }
}
