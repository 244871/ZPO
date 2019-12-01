package edu.ib;

import java.util.ArrayList;

public class NewtonE {
    NewtonE(double xl, double h,double dok, int maxIter) {
        getWynikiNewtonE(xl,h, dok, maxIter);
    }
    private void getWynikiNewtonE(double xl, double h, double dok, int maxIter) {
        ArrayList<Wyniki2> wyniki2= new ArrayList<Wyniki2>();
        double xstare=xl;
        for (int i = 0; i <maxIter; i++) {

            xl = obliczxr(xl, xstare, h);

            if(dokladnosc(xl)<=dok){
                break;
            }
            wyniki2.add(new Wyniki2(i, xl, oblicz(xl), bladT(oblicz(xl)),
                    dokladnosc(xl), obliczxr(xl, xstare, h),
                    oblicz(obliczxr(xl, xstare, h))));
        }

        System.out.println("3");
        System.out.print(wyniki2.toString());
        System.out.println();
    }
    private static double oblicz(double x){
        return 1+0.0167*x-x;
    }
    private static double bladT(double wynik){
        return (1.0169827938079834-wynik);
    }
    private static double dokladnosc(double xl){
        return (Math.abs((xl - oblicz(xl)) / xl)) * 100;
    }
    private static double obliczxr(double xl, double xstare, double h){
        return xl-(oblicz(xl)/(oblicz(xstare)-oblicz(oblicz(xl)))/2*h);
    }
}

//popraw wyświetlanie wyników i przerywanie pętli
