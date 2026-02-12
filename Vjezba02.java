import java.util.Scanner;

public class Vjezba02 {

    public static void main (String[] args) {
        int[] novcanice = {500, 200, 100, 50, 20, 10, 5};
        double[] kovanice = {2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        Scanner scan = new Scanner(System.in);

        System.out.print("Iznos računa: ");
        double iznosRacuna = scan.nextDouble();

        System.out.print("Iznos koji je kupac dao: ");
        double novac = scan.nextDouble();

        double zaVratiti = novac - iznosRacuna;
        System.out.printf("Za vratiti: %.2f €\n", zaVratiti);

        int ostatak = (int)Math.round(zaVratiti * 100);

        System.out.println("Novčanice:");
        for (int i = 0; i < novcanice.length; i++) {
            int vrijednost = novcanice[i] * 100;
            int broj = ostatak / vrijednost;

            if (broj > 0) {
                System.out.println(novcanice[i] + "€ x " + broj);
                ostatak = ostatak % vrijednost;
            }
        }

        System.out.println("Kovanice:");
        for (int i = 0; i < kovanice.length; i++) {
            int vrijednost = (int)Math.round(kovanice[i] * 100);
            int broj = ostatak / vrijednost;

            if (broj > 0) {
                System.out.println(kovanice[i] + "€ x " + broj);
                ostatak = ostatak % vrijednost;
            }
        }
        scan.close();
    }
}
