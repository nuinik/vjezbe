import java.util.*;

public class Vjezba03 {

    public static void main(String[] args) {
        prviZadatak();
        drugiZadatak();
    }

    private static void prviZadatak() {
        int slova = 0;
        int brojevi = 0;
        int ostaliZnakovi = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesi rečenicu: ");
        String recenica = scan.nextLine();

        char[] ch = recenica.toCharArray();

        for (int i = 0; i < ch.length; i++){
            if (Character.isLetter(ch[i])){
                slova++;
            } else if (Character.isDigit(ch[i])) {
                brojevi++;
            } else {
                ostaliZnakovi++;
            }
        }

        System.out.println("Slova; " + slova);
        System.out.println("Brojevi: " + brojevi);
        System.out.println("Ostali znakovi: " + ostaliZnakovi);
    }

    private static void drugiZadatak() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Unesi rečenicu: ");
        String recenica = scan.nextLine();

        List<String> rijeci = Arrays.asList(recenica.split(" "));
        Collections.reverse(rijeci);

        System.out.println(String.join(" ", rijeci));
    }
}

