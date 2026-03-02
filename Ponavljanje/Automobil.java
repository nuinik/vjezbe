package Ponavljanje;

public class Automobil extends Vozilo {

    private int vrata;

    public Automobil (String marka, int vrata, int brzina){
        super(marka, brzina);
        this.vrata = vrata;
    }

    public int getVrata() {
        return vrata;
    }

    public void setVrata(int vrata) {
        this.vrata = vrata;
    }


    @Override
    public void prikažiPodatke() {
        System.out.println("Marka automobila: " + getMarka());
        System.out.println("Brzina: " + getBrzina());
        System.out.println("Broj vrata: " + vrata);

    }
}
