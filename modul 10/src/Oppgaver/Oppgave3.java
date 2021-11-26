package Oppgaver;
import java.util.ArrayList;
public class Oppgave3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> Tall = new ArrayList<>();

        for (int i = 0; i < array.length; i++){
            Tall.add(array[i]);
        }
        for (int i = 0; i < Tall.size(); i++){
            System.out.println(Tall.get(i));
        }

    }
}
