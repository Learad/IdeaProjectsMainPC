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
    public void skrivUt(){
        System.out.println("2 + 2 er " + addere(2,2) +
                "\n4-2 er" + subtrahere(4,2) +
                "\n6/3 er" + dele(6,3) +
                "\n6*3 er" + multiplisere(6,3));
    }
}

public class Oppgave5 {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.skrivUt();
    }

}
