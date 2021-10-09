package oppgaver;

class BøkerNy{
    String bok;
    String forfatter;
    double pris;
    String iSBNNumber;

    public void skrivUtAttributter(){
        System.out.println("\nBok: " + bok + "\nForfatter: " + forfatter + " \npris: " + pris + "kr \niSBN-Nummer: " +iSBNNumber);
    }

}

public class Oppgave1forsøk2 {
    public static void main(String[] args) {

        BøkerNy bøker = new BøkerNy();

        bøker.bok = "Lord of the rings";
        bøker.forfatter = "Leart Radoniqi";
        bøker.pris = 199.50;
        bøker.iSBNNumber = "1234567890";

        bøker.skrivUtAttributter();
    }
}
