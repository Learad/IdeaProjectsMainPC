package Oppgaver;

class Dato {
    private int dag, måned, år;

    public Dato( int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år = år;
    }

    private static String månedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }

    public String toString(){
        return dag + " " + månedsnavn(måned) + " " + år;
    }
}

class Bil{
    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer
    String biltype;
    Dato førstereg;
    String skiltnr;

    // lag også konstruktør for alle attributtene
        public Bil(String biltype, Dato førstereg, String skiltnr){
            this.biltype = biltype;
            this.førstereg = førstereg;
            this.skiltnr = skiltnr;
        }

    // lag så en toString metode for å vise alle attributtene
    public String toString(){
        return biltype + " " + førstereg + " " + skiltnr;
    }

}

public class MotorvognReg {

    public static void main(String[] args) {
        // opprett et array av Biler
        Bil[] bilRegister = new Bil[100];

        // objekter

        Dato dato1 = new Dato(30, 1, 2014);
        Bil b = new Bil("Audi A6", dato1,"3B123D1");
        Dato dato2 = new Dato(24,3,2011);
        Bil b2 = new Bil("Volvo", dato2, "BC 12345");
        Dato dato3 = new Dato(12,2, 2017);
        Bil b3 = new Bil("Nisan", dato3, "AB 23456");
        Dato dato4 = new Dato(1,1,2001);
        Bil b4 = new Bil("Tesla", dato4, "AE 31532");

        // Sett inn noen biler i arrayet

        bilRegister[0] = b;
        bilRegister[1] = b2;
        bilRegister[2] = b3;
        bilRegister[3] = b4;

        // List motorvognregisteret (arrayet) ved hjelp av en løkke

        for (Bil enBil : bilRegister){
            if (enBil != null){
                System.out.println(enBil);
            }
        }
    }
}

