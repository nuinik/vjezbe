package OPJJavaZavrsniZadatak;

public class Main {
    public static void main(String[] args) {
        EvidencijaVozila evidencija = new EvidencijaVozila();

        try {
            Automobil a1 = new Automobil("KT254NN", "Daewoo", 2000, 5);
            Automobil a2 = new Automobil("KT133IN", "volkswagen Polo", 1993, 3);
            Motocikl m1 = new Motocikl("ZG1234šAA", "Yamaha", 2012, "Sportski");

            evidencija.dodajVozilo(a1);
            evidencija.dodajVozilo(a2);
            evidencija.dodajVozilo(m1);
        } catch (NeispravniPodaciException e) {
            System.out.println(e.getMessage());
        }
        evidencija.spremiPodatkeUDatoteku("vozila.txt");
        evidencija.ucitajPodatkeIzDatoteke("vozila.txt");
        evidencija.prikaziSvaVozila();
    }
}
