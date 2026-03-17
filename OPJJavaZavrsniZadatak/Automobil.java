package OPJJavaZavrsniZadatak;

public class Automobil extends Vozilo {

    private int brojVrata;

    public Automobil(String registracijskiBroj, String marka, int godinaProizvodnje, int brojVrata) throws NeispravniPodaciException {
        super(registracijskiBroj, marka, godinaProizvodnje);
        setBrojVrata(brojVrata);
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) throws NeispravniPodaciException {
        if (brojVrata < 0) {
            throw new NeispravniPodaciException("Broj vrata ne može biti negativan!");
        }
        this.brojVrata = brojVrata;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Broj vrata: " + brojVrata);
    }

    @Override
    public String toString() {
        return "AUTOMOBIL;" + registracijskiBroj + ";" + marka + ";" + godinaProizvodnje + ";" + brojVrata;
    }
}
