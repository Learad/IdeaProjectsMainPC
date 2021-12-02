package Oppgaver;

class Klokke{
    private int timer;
    private int minutter;
    private int sekunder;

    public Klokke(int timer, int minutter, int sekunder){
        this.timer = timer;
        this.minutter = minutter;
        this.sekunder = sekunder;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int time) {
        if(time <= 24 && time >= 0){
            this.timer = time;
        }
    }

    public int getMinutter() {
        return minutter;
    }

    public void setMinutter(int minutter) {
        if(minutter <= 59 && minutter >= 0){
            this.minutter = minutter;
        }
    }

    public int getSekunder() {
        return sekunder;
    }

    public void setSekunder(int sekunder) {
        if(sekunder <= 59 && sekunder >= 00){
            this.sekunder = sekunder;
        }
    }

    public void visTid(){
        String tid = timer +":"+ minutter +":"+ sekunder;
        System.out.println(tid);
    }
}



public class Oppgave4 {
    public static void main(String[] args) {
        Klokke k = new Klokke(23,59,59);
        k.visTid();


    }
}
