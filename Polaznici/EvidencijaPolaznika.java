package Polaznici;

import java.util.ArrayList;
import java.util.Scanner;

public class EvidencijaPolaznika {

    private static ArrayList<Polaznik> polaznik = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sc;

        do {
            System.out.println("0. Izlaz");
            System.out.println("1. Dodaj polaznika");
            System.out.println("2. Ispis svih polaznika");
            System.out.println("3. Pretraživanje polaznika po mail adresi");
            System.out.println("Odabir: ");

            sc = scanner.nextInt();
            scanner.nextLine();

            switch (sc) {
                case 0;
                    System.out.println("Izlaz iz izbornik");
                case 1:
                    dodajPolaznika();
                    break;
                case 2:
                    ispisPolaznika();
                    break;
                case 3:
                    pretragaPoEmailu();
                    break;
                default:
                    System.out.println("Neispravan odabir.");
            }
        } while (sc != 0);
    }

    public static void dodajPolaznika() {
        System.out.println("Ime polaznika: ");
        String ime = scanner.nextLine();

        System.out.println("Prezime polaznika: ");
        String prezime = scanner.nextLine();

        System.out.println("Email polaznika: ");
        String email = scanner.nextLine();

        polaznik.add(new Polaznik(ime, prezime, email));
        System.out.println("Polaznik uspješno dodan!");
    }

    public static void ispisPolaznika() {
        if (polaznik.isEmpty()) {
            System.out.println("Nema unesenih polaznika.");
            return;
        }
        System.out.println("Popis polaznika: ");
        for (Polaznik p : polaznik) {
            System.out.println(p);
        }
    }

    public static void pretragaPoEmailu() {
        System.out.print("Unesi e-mail za pretragu: ");
        String email = scanner.nextLine();

        for (Polaznik p : polaznik) {
            if (p.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Pronađen: " + p);
                return;
            }
        }

        System.out.println("Polaznik s tim e-mailom nije pronađen.");
    }
}
