package Ponavljanje;

public abstract class Main {
    public static void main(String[] args) {

        Automobil a1 = new Automobil("Fiat", 5, 120);
        Automobil a2 = new Automobil("Golf", 4, 160);

        Motocikl m1 = new Motocikl("Yamaha", "sportski", 180);
        Motocikl m2 = new Motocikl("Honda", "touring", 120);

        Ubrzanje[] vozila = {a1, a2, m1, m2};

        for (Ubrzanje v : vozila) {
            v.ubrzaj(40);
        }

        a1.prikažiPodatke();
        a2.prikažiPodatke();
        m1.prikažiPodatke();
        m2.prikažiPodatke();
    }
}
