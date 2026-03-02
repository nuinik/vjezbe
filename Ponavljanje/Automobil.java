package Ponavljanje;

public class Automobil implements Ubrzanje {

    private String marka;
    private int vrata;
    private int brzina;

    public Automobil (String marka, int vrata, int brzina){
        this.marka = marka;
        this.vrata = vrata;
        this.brzina = brzina;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka){
        this.marka = marka;
    }

    public int getVrata() {
        return vrata;
    }

    public void setVrata(int vrata) {
        this.vrata = vrata;
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
        System.out.println("Marka automobila: " + marka);
        System.out.println("Brzina: " + brzina);
        System.out.println("Broj vrata: " + vrata);

    }
}
