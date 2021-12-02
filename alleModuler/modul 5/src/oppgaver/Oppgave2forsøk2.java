package oppgaver;

class Person3{
    String navn;
    String adresse;
    String telefonnr;
    int fødselsår;

    public int alder(){
        int alder = 2021 - fødselsår;
        return alder;
    }

    public void skrivUtData(int alder){
        System.out.println(navn +" med adresse " + adresse + " med telefonnummer " + telefonnr + " er " + alder
                + " år.");
    }




}

public class Oppgave2forsøk2 {
    public static void main(String[] args) {
        Person3 person = new Person3();
        person.navn = "Per Hansen";
        person.adresse = "Dal 12";
        person.telefonnr = "12345678";
        person.fødselsår = 1967;

        int alder = person.alder();
        person.skrivUtData(alder);

    }
}
