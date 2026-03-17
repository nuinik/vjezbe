package OPJJavaZavrsniZadatak;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EvidencijaVozila {
    private List<Vozilo> vozila = new ArrayList<>();

    public void dodajVozilo(Vozilo brmbrm) {
        vozila.add(brmbrm);
    }

    public void prikaziSvaVozila() {
        for (Vozilo brmbrm : vozila) {
            brmbrm.prikaziPodatke();
            System.out.println("----VOZILO----");
        }
    }

    public void spremiPodatkeUDatoteku(String datoteka) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(datoteka))) {
            for (Vozilo brmbrm : vozila) {
                pw.println(brmbrm.toString());
            }
        } catch (IOException e) {
            System.out.println("Greška: " + e.getMessage());
        }
    }

    public void ucitajPodatkeIzDatoteke(String datoteka) {
        vozila.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(datoteka))) {
            String linija;

            while ((linija = br.readLine()) != null) {
                String[] d = linija.split(";");

                try {
                    switch (d[0]) {
                        case "AUTOMOBIL":
                            vozila.add(new Automobil(d[1], d[2], Integer.parseInt(d[3]), Integer.parseInt(d[4])));
                            break;

                        case "MOTOCIKL":
                            vozila.add(new Motocikl(d[1], d[2], Integer.parseInt(d[3]), d[4]));
                            break;

                        case "VOZILO":
                            vozila.add(new Vozilo(d[1], d[2], Integer.parseInt(d[3])));
                            break;
                    }
                } catch (NeispravniPodaciException e) {
                    System.out.println("Preskočen zapis: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("Greška: " + e.getMessage());
        }
    }
}
