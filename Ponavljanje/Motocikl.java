package Ponavljanje;

public class Motocikl extends Vozilo {

    private String tip;

    public Motocikl (String marka, String tip, int brzina){
        super(marka, brzina);
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }


    @Override
    public void prikažiPodatke() {
        System.out.println("Marka motocikla: " + getMarka());
        System.out.println("Brzina: " + getBrzina());
        System.out.println("Tip: " + tip);
    }
}
