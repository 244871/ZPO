package edu.ib;

import java.util.ArrayList;

public class FixedPointE {
    FixedPointE(double xl, double dok, int maxIter) {
        getWynikiFixedPointE(xl, dok, maxIter);
    }
    private void getWynikiFixedPointE(double xl, double dok, int maxIter) {
        ArrayList<Wyniki> wyniki= new ArrayList<Wyniki>();
        for (int i = 0; i <maxIter; i++) {
            if (oblicz(obliczxr(xl)) * oblicz(xl) > 0) {
                xl = obliczxr(xl);
            } else {
                break;
            }
            if(dokladnosc(xl)<=dok){
                break;
            }
            wyniki.add(new Wyniki(i, xl, oblicz(xl), oblicz(xl), oblicz(oblicz(xl)), bladT(oblicz(xl)),
                    bladT(oblicz(xl)), dokladnosc(xl), obliczxr(xl),
                    oblicz(obliczxr(xl))));
        }

        System.out.println("2");
        System.out.print(wyniki.toString());
        System.out.println();
    }
    private static double oblicz(double x){
        return 1+0.0167*x-x;
    }
    private static double bladT(double wynik){
        return ((Math.sqrt(3)-wynik)*100)/Math.sqrt(3);
    }
    private static double dokladnosc(double xl){
        return (Math.abs((xl - oblicz(xl)) / xl)) * 100;
    }
    private static double obliczxr(double xl){
        return oblicz(xl)+xl;
    }
}

//Zmień sposób wyświetlania wyników!!!
