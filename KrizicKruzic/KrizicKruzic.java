package KrizicKruzic;

import java.util.Scanner;

public class KrizicKruzic {

    private Igrac igrac1;
    private Igrac igrac2;
    private Igrac trenutniIgrac;
    private Konzola konzola;

    public KrizicKruzic() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ime prvog igrača: ");
        igrac1 = new Igrac(scan.nextLine(), 'X');

        System.out.print("Ime drugog igrača: ");
        igrac2 = new Igrac(scan.nextLine(), 'O');

        konzola = new Konzola();
        trenutniIgrac = igrac1;
    }

    public void igra() {
        Scanner scan = new Scanner(System.in);

        while(true) {
            konzola.ploca();

            System.out.println(trenutniIgrac.getIme() + " na potezu (" + trenutniIgrac.getSimbol() + ")");

            System.out.print("Red (0-2): ");
            int row = scan.nextInt();

            System.out.print("Stupac (0-2): ");
            int col = scan.nextInt();

            if(!konzola.potez(row, col, trenutniIgrac.getSimbol())) {
                System.out.println("Polje zauzeto, pokusaj ponovno!");
                continue;
            }

            if(konzola.pobjednik(trenutniIgrac.getSimbol())) {
                konzola.ploca();
                System.out.println("Pobjednik je: " + trenutniIgrac.getIme());
                break;
            }

            if(konzola.nerijeseno()) {
                konzola.ploca();
                System.out.println("Igra je nerijesena.");
                break;
            }
            promjenaIgraca();
        }
    }

    private void promjenaIgraca() {
        if(trenutniIgrac == igrac1) {
            trenutniIgrac = igrac2;
        }
        else {
            trenutniIgrac = igrac1;
        }
    }
}
