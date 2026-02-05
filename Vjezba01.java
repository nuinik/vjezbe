public class Vjezba01 {

    public static void main (String[] args){
        for (int i = 1; i < 10000; i++) {
            if (armstrongovBroj(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean armstrongovBroj(int i) {
        int broj = i;
        int suma = 0;
        int znamenke = String.valueOf(i).length();

        while (i > 0) {
            int znamenka = i % 10;
            suma += Math.pow(znamenka, znamenke);
            i /= 10;
        }
        return suma == broj;
    }
}
