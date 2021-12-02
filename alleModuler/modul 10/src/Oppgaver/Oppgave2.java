package Oppgaver;

import java.util.ArrayList;

public class Oppgave2 {
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

        for(int i = tall.size()-1; i >= 0; i--){
            if(tall.get(i) == 2){
                tall.remove(i);
            }
            if(tall.get(i) == 3){
                tall.remove(i);
            }
        }

        //tall.remove(1);
        //tall.remove(1);

        tall.add(10);
        tall.add(11);

        for (int i = 0; i < tall.size(); i++){
            System.out.println(tall.get(i));
        }
    }
}
