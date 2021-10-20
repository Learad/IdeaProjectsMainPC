package Oppgaver;

class BensinKjop{
    final private String osloBensinstasjon;
    final private String bensin;
    final private double antLiter;
    final private double pris;
    final private String tidspunktFylt;

    public BensinKjop(String osloBensinstasjon, String bensin, double antLiter, double pris, String tidspunktFylt){
        this.osloBensinstasjon = osloBensinstasjon;
        this.bensin = bensin;
        this.antLiter = antLiter;
        this.pris = pris;
        this.tidspunktFylt = tidspunktFylt;
    }

    public String getOsloBensinstasjon() {
        return osloBensinstasjon;
    }

    public String getBensin() {
        return bensin;
    }



    public double getAntLiter() {
        return antLiter;
    }

    public double getPris() {
        return pris;
    }

    public String getTidspunktFylt() {
        return tidspunktFylt;
    }

    double finnTotalPris = antLiter * pris;
}

public class Oppgave3 {
    public static void main(String[] args) {

        String.format("%.2f", pris);
    }
}
