package OPJJavaZavrsniZadatak;

public class Vozilo {

    protected String registracijskiBroj;
    protected String marka;
    protected int godinaProizvodnje;

    public Vozilo(String registracijskiBroj, String marka, int godinaProizvodnje) throws NeispravniPodaciException {
        setRegistracijskiBroj(registracijskiBroj);
        setMarka(marka);
        setGodinaProizvodnje(godinaProizvodnje);
    }

    public String getRegistracijskiBroj() {
        return registracijskiBroj;
    }

    public void setRegistracijskiBroj(String registracijskiBroj) throws NeispravniPodaciException {
        if (registracijskiBroj == null || registracijskiBroj.isEmpty()) {
            throw new NeispravniPodaciException("Registracijski broj ne može biti prazan!");
        }
        this.registracijskiBroj = registracijskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) throws NeispravniPodaciException {
        if (marka == null || marka.isEmpty()) {
            throw new NeispravniPodaciException("Marka ne može biti prazna!");
        }
        this.marka = marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) throws NeispravniPodaciException {
        if (godinaProizvodnje < 0) {
            throw new NeispravniPodaciException("Godina proizvodnje ne može biti negativna!");
        }
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public void ucitajPodatke(String registracijskiBroj, String marka, int godinaProizvodnje) throws NeispravniPodaciException {
        setRegistracijskiBroj(registracijskiBroj);
        setMarka(marka);
        setGodinaProizvodnje(godinaProizvodnje);
    }

    public void prikaziPodatke() {
        System.out.println("Registracijski broj: " + registracijskiBroj);
        System.out.println("Marka: " + marka);
        System.out.println(("Godina proizvodnje: " + godinaProizvodnje));
    }

    @Override
    public String toString() {
        return "VOZILO;" + registracijskiBroj + ";" + marka + ";" + godinaProizvodnje;
    }
}
