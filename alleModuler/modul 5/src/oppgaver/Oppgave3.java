package oppgaver;

class Person{
    public String navn;
    public String adresse;
    public String telefonnr;
    public int fødselsår;

    public int alder(){
        int alder = 2021 - fødselsår;
        return alder;
    }

    public void skrivUtData(int alder){
        System.out.println(navn +" med adresse " + adresse + " med telefonnummer " + telefonnr + " er " + alder
         + " år.");

    }

}

public class Oppgave3 {
    public static void main(String[] args) {
        Person person = new Person();
        person.navn = "Per Hansen";
        person.telefonnr = "22124512";
        person.adresse = "Osloveien 82";
        person.fødselsår = 2000;

        int alder = person.alder();
        person.skrivUtData(alder);
    }
}
