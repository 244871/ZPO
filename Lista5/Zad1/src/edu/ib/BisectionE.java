package edu.ib;

import java.util.ArrayList;

public class BisectionE {

    BisectionE(double xl, double xu, double dok, int maxIter) {
        getWynikiBisectionE(xl, xu, dok, maxIter);
    }
    private void getWynikiBisectionE(double xl, double xu, double dok, int maxIter) {
        ArrayList<Wyniki> wyniki= new ArrayList<Wyniki>();
        for (int i = 0; i <maxIter; i++) {
            if (oblicz(obliczxr(xl, xu)) * oblicz(xl) > 0) {
                xl = obliczxr(xl, xu);
            } else {
                xu = obliczxr(xl, xu);
            }
            if(dokladnosc(xl, xu)<=dok){
                break;
            }
            wyniki.add(new Wyniki(i, xl, oblicz(xl), xu, oblicz(xu), bladT(oblicz(xl)),
                    bladT(oblicz(xu)), dokladnosc(xl, xu), obliczxr(xl, xu),
                    oblicz(obliczxr(xl, xu))));
        }

        System.out.println("1");
        System.out.print(wyniki.toString());
        System.out.println();
    }
    private static double oblicz(double x){
        return 1+0.0167*x-x;
    }
    private static double bladT(double wynik){
        return ((Math.sqrt(3)-wynik)*100)/Math.sqrt(3);
    }
    private static double dokladnosc(double xl, double xu){
        return (Math.abs((xl - xu) / xl)) * 100;
    }
    private static double obliczxr(double xl, double xu){
        return (xu + xl) / 2;
    }
}

