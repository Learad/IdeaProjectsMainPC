package Oppgaver;

public class Oppgave7 {
    public static void main(String[] args){
        //Lag et program som teller opp antall partall og antall oddetall i et helttalls-array.

        int[]array = {0,1,2,3,4,5,6,7,8,9,10};
        int partallTeller = 0;
        int oddetallTeller = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                partallTeller ++;
            }else{
                oddetallTeller ++;
            }
        }
        System.out.println(partallTeller);
        System.out.println(oddetallTeller);
    }
}
