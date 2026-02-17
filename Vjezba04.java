import java.util.Scanner;

public class Vjezba04 {

    public static void main(String[] args) {
        povrsinaPravokutnika();
        temperatura();
        fizzBuzz();
        minMaxCijeliBroj();
        oib();
    }

    private static void povrsinaPravokutnika() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Unesi duljinu pravokutnika:");
        double duljina = scan.nextDouble();

        System.out.println("Unesi širinu pravokutnika:");
        double sirina = scan.nextDouble();

        double povrsina = duljina * sirina;

        System.out.println("Površina pravokutnika je: " + povrsina);
    }

    private static void temperatura() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Upiši temperaturu u celzijusima:");
        double celzijus = scan.nextDouble();
        double farenhait = celzijus * 9/5 + 32;
        double kelvini = celzijus + 273.15;

        System.out.println("Temperatura u Farenheitima: " + farenhait);
        System.out.println("Temperatura u Kelvinima: " + kelvini);
    }

    private static void fizzBuzz() {
        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static void minMaxCijeliBroj(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Cijeli brojevi: ");
        int n = scan.nextInt();

        int[] brojevi = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj " + (i + 1) + ": ");
            brojevi[i] = scan.nextInt();
        }

        int min = brojevi[0];
        int max = brojevi[0];

        for (int i = 1; i < n; i++) {
            if (brojevi[i] < min) {
                min = brojevi[i];
            }
            if (brojevi[i] > max) {
                max = brojevi[i];
            }
        }

        System.out.println("Najmanji broj je: " + min);
        System.out.println("Najveći broj je: " + max);
    }

    private static void oib() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Unesi OIB: ");
        String oib = scan.nextLine();

        if (oib == null || !oib.matches("\\d{11}")) {
            System.out.println("OIB nije valjan, mora imati 11 znamenki!");
            return;
        }

        int ukupno = 10;

        for (int i = 0; i < 10; i++) {
            int broj = Character.getNumericValue(oib.charAt(i));

            ukupno = (ukupno + broj) % 10;
            if (ukupno == 0) {
                ukupno = 10;
            }
            ukupno = (ukupno * 2) % 11;
        }

        int provjera = 11 - ukupno;
        if (provjera == 10) {
            provjera = 0;
        }

        int kontrolniBroj = Character.getNumericValue(oib.charAt(10));

        if (provjera == kontrolniBroj) {
            System.out.println("OIB je valjan.");
        } else {
            System.out.println("OIB nije valjan.");
        }
    }
}

