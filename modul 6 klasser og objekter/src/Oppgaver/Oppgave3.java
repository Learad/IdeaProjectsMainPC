package Oppgaver;

class BensinKjop{
    private String osloBensinstasjon;
    private String bensin;
    private double antLiter;
    private double pris;
    private String tidspunktFylt;

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

    public void setOsloBensinstasjon(String osloBensinstasjon) {
        this.osloBensinstasjon = osloBensinstasjon;
    }

    public String getBensin() {
        return bensin;
    }

    public void setBensin(String bensin) {
        this.bensin = bensin;
    }

    public void setAntLiter(double antLiter) {
        this.antLiter = antLiter;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public void setTidspunktFylt(String tidspunktFylt) {
        this.tidspunktFylt = tidspunktFylt;
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

    public double finnPris(){
        double finnTotalPris = antLiter * pris;
        return finnTotalPris;
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        String sted = "Oslo";
        String bensin = "Bensin";
        double liter = 24.2;
        double pris = 17.3;
        String tidspunkt = "17:00";
        BensinKjop b = new BensinKjop(sted,bensin,liter,pris,tidspunkt);
        double totalpris = b.finnPris();

        System.out.println("sted: " + b.getOsloBensinstasjon() + "\nbensin: " + b.getBensin() +
                           "\nliter: " + b.getAntLiter() + "\npris: " + b.getPris() + "\ntidspunkt: " + b.getTidspunktFylt() +
                           "\ntotalpris: " + String.format("%.2f", totalpris));

    }
}
