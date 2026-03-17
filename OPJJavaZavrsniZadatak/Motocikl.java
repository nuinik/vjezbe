package OPJJavaZavrsniZadatak;

public class Motocikl extends Vozilo {
    private String tipMotora;

    public Motocikl(String registracijskiBroj, String marka, int godinaProizvodnje, String tipMotora) throws NeispravniPodaciException {
        super(registracijskiBroj, marka, godinaProizvodnje);
        setTipMotora(tipMotora);
    }

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) throws NeispravniPodaciException {
        if (tipMotora == null || tipMotora.isEmpty()) {
            throw new NeispravniPodaciException("Tip motora ne može biti prazan!");
        }
        this.tipMotora = tipMotora;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Tip motora: " + tipMotora);
    }

    @Override
    public String toString() {
        return "MOTOCIKL;" + registracijskiBroj + ";" + marka + ";" + godinaProizvodnje + ";" + tipMotora;
    }
}
