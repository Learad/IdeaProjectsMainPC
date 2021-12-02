package oppgaver;

class Bøker{
    public String tittel;
    public double pris;
    public String forfatter;
    public String iSBN_Nummer;

    public void skrivUtAttributter(){
        System.out.println("tittel: " + tittel + "\npris: " + pris + "\nforfatter: " + forfatter + " \niSBN-nummer: " +iSBN_Nummer);
    }
}

public class Oppgave1 {
    public static void main(String[] args) {
        Bøker bok = new Bøker();
        bok.tittel = "Lord of the rings";
        bok.pris = 199.00;
        bok.forfatter = "Tolkien";
        bok.iSBN_Nummer = "321234";

        bok.skrivUtAttributter();


    }
}
