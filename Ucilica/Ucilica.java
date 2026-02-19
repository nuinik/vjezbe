package Ucilica;

public class Ucilica {

    public static void main(String[] args) {
        Krug krug = new Krug("Krug", 9);
        Trokut trokut = new Trokut("Trokut", 4, 7, 9);
        Pravokutnik pravokutnik = new Pravokutnik("Pravokutnik", 14, 17);

        krug.setNaziv("Krugiša");
        trokut.setNaziv("Trokutiša");
        pravokutnik.setNaziv("Pravokutniša");

        System.out.println(krug.getNaziv());
        System.out.println(trokut.getNaziv());
        System.out.println(pravokutnik.getNaziv());
    }
}
