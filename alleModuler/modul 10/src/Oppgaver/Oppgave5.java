package Oppgaver;

public class Oppgave5 {
    public static void main(String[] args) {

        int[][] filmanmeldelser = new int[4][3];
        filmanmeldelser [0][0] = 4;
        filmanmeldelser [1][0] = 6;
        filmanmeldelser [2][0] = 2;
        filmanmeldelser [3][0] = 5;
        filmanmeldelser [0][1] = 7;
        filmanmeldelser [1][1] = 9;
        filmanmeldelser [2][1] = 4;
        filmanmeldelser [3][1] = 8;
        filmanmeldelser [0][2] = 6;
        filmanmeldelser [1][2] = 9;
        filmanmeldelser [2][2] = 3;
        filmanmeldelser [3][2] = 7;

        int gjennomsnitt = 0;

        for (int i = 0; i < 4; i++){
            gjennomsnitt = 0;
            for (int j = 0; j < 3; j++){
                gjennomsnitt += filmanmeldelser[i][j];
            }
            gjennomsnitt = gjennomsnitt/3;
            System.out.println(gjennomsnitt);
        }
    }
}
