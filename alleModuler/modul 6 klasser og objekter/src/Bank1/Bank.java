package Bank1;

public class Bank {
    public static void main(String[] args) {
        Konto sparekonto = new Konto("12345678901", "Per Hansen", 1000);
        Konto lonnskonto = new Konto("12345678901", "Per hansen", 0);
        sparekonto.setSaldo(2000);
        lonnskonto.setSaldo(3000);

        System.out.println("Sparekontoen tilhører " + sparekonto.getNavn());
        System.out.println("Saldoen til denne er nå " + sparekonto.getSaldo() + "kr");
        System.out.println("Saldoen til lønnskontoen er " + lonnskonto.getSaldo() + "kr");


    }
}
