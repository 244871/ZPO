package edu.ib;

import java.util.ArrayList;

public class SieczneE {

    SieczneE(double x, double xstare, double dok, int maxIter) {
        getWynikiSieczneE(x, xstare, dok, maxIter);
    }
    private void getWynikiSieczneE(double x, double xstare, double dok, int maxIter) {
        ArrayList<Wyniki2> wyniki2= new ArrayList<Wyniki2>();
        for (int i = 0; i <maxIter; i++) {
            if (oblicz(obliczxr(x, xstare)) * oblicz(x) > 0) {
                x = obliczxr(x, xstare);
            } else {
                break;
            }
            if(dokladnosc(x, xstare)<=dok){
                break;
            }
            wyniki2.add(new Wyniki2(i, x, oblicz(x), bladT(oblicz(x)),
                    dokladnosc(x, xstare), obliczxr(x, xstare),
                    oblicz(obliczxr(x, xstare))));
        }

        System.out.println("4");
        System.out.print(wyniki2.toString());
        System.out.println();
    }
    private static double oblicz(double x){
        return 1+0.0167*x-x;
    }
    private static double bladT(double wynik){
        return (1.0169827938079834-wynik);
    }
    private static double dokladnosc(double x, double xstare){
        return (Math.abs((x - xstare) / x)) * 100;
    }
    private static double obliczxr(double xl, double xstare){
        return xl-(oblicz(xl)*(xstare-xl))/(oblicz(xstare)-oblicz(xl));
    }



    /*

    SieczneE(double xl, double dok, int maxIter) {
        getWynikiSieczneE(xl, dok, maxIter);

    }
    private void getWynikiSieczneE(double xl, double dok, int maxIter) {
        ArrayList<Wyniki2> wyniki2= new ArrayList<Wyniki2>();
        double xstare=xl;

        for (int i = 0; i <maxIter; i++) {

            xl = obliczxr(xl, xstare);

            if (dokladnosc(xl) <= dok) {
                break;
            }
            wyniki2.add(new Wyniki2(i, xl, oblicz(xl), bladT(oblicz(xl)),
                    dokladnosc(xl), obliczxr(xl, xstare),
                    oblicz(obliczxr(xl, xstare))));
        }

        System.out.println("4");
        System.out.print(wyniki2.toString());
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
    private static double obliczxr(double xl, double xstare){
        return xl-(oblicz(xl)*(xstare-xl))/(oblicz(xstare)-oblicz(xl));
    }
    */

}
