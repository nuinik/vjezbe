package Ucilica;

import java.util.ArrayList;
import java.util.Collections;

public class Ucilica {

    public static void main(String[] args) {

        ArrayList<GeometrijskiLik> geoLikovi = new ArrayList<>();

        Krug k1 = new Krug("K1", 27);
        Krug k2 = new Krug("K2", 17);

        Trokut t1 = new Trokut("T1", 4, 19, 7);
        Trokut t2 = new Trokut("T2", 9, 14, 17);

        Pravokutnik p1 = new Pravokutnik("P1", 21, 23);
        Pravokutnik p2 = new Pravokutnik("P2", 14, 24);

        geoLikovi.add(k1);
        geoLikovi.add(k2);
        geoLikovi.add(t1);
        geoLikovi.add(t2);
        geoLikovi.add(p1);
        geoLikovi.add(p2);

        Collections.sort(geoLikovi);

        for(GeometrijskiLik g: geoLikovi){
            System.out.println(g);
        }
    }
}
