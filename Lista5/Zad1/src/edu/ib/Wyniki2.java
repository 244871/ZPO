package edu.ib;

public class Wyniki2 {
    int iteracja;
    double x;
    double wynik;
    double bladt_x;
    double dokladnosc;
    double xr;
    double wynikr;
    public Wyniki2(int iteracja, double x, double wynik, double bladt_x, double dokladnosc, double xr, double wynikr) {
        this.iteracja = iteracja;
        this.x = x;
        this.wynik = wynik;
        this.bladt_x = bladt_x;
        this.dokladnosc = dokladnosc;
        this.xr = xr;
        this.wynikr = wynikr;
    }
    @Override
    public String toString() {
        return "\n" +
                "iteracja=" + iteracja +
                ", xl=" + x +
                ", wynikl=" + wynik +
                ", bladt_xl=" + bladt_x +
                ", dokladnosc=" + dokladnosc +
                ", xr=" + xr +
                ", wynikr=" + wynikr;
    }
}
