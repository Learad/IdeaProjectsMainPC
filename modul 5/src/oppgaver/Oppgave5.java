package oppgaver;

class Kalkulator{
    public static double addere(double tall1, double tall2) {
        double sum = tall1 + tall2;
        return sum;
    }

    public static double subtrahere(double tall1, double tall2){
        double sum = tall1 - tall2;
        return sum;
    }

    public static double multiplisere(double tall1, double tall2) {
        double sum= tall1 * tall2;
        return sum;
    }

    public static double dele(double tall1, double tall2) {
        double sum = tall1 / tall2;
        return sum;
    }
}

public class Oppgave5 {
    public static void main(String[] args) {
        System.out.println("2 + 2 er " + Kalkulator.addere(2,2) +
                "\n4-2 er" +Kalkulator.subtrahere(4,2) +
                "\n6/3 er" +Kalkulator.dele(6,3) +
                "\n6*3 er" +Kalkulator.multiplisere(6,3));
    }

}
