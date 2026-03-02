package Ponavljanje;

public class Motocikl implements Ubrzanje {

    private String marka;
    private String tip;
    private int brzina;

    public Motocikl (String marka, String tip, int brzina){
        this.marka = marka;
        this.tip = tip;
        this.brzina = brzina;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka){
        this.marka = marka;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    @Override
    public void ubrzaj(int iznos) {
        brzina += iznos;
    }

    public void prikažiPodatke() {
        System.out.println("Marka motocikla: " + marka);
        System.out.println("Brzina: " + brzina);
        System.out.println("Tip: " + tip);
    }
}
