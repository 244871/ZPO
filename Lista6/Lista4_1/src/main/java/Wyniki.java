import javafx.scene.chart.XYChart;

public class Wyniki {
    public int iteracja;
    public double xl;
    public double wynikl;
    public double xu;
    public double wyniku;
    public double dokladnosc;
    public double xr;
    public double wynikr;
    /// ET
    public double bladt_xr;
    public double blada_xr;

    public Wyniki(int iteracja, double xl, double wynikl, double xu, double wyniku, double dokladnosc, double xr, double wynikr, double bladt_xr, double blada_xr) {
        this.iteracja = iteracja;
        this.xl = xl;
        this.wynikl = wynikl;
        this.xu = xu;
        this.wyniku = wyniku;
        this.dokladnosc = dokladnosc;
        this.xr = xr;
        this.wynikr = wynikr;
        this.bladt_xr = bladt_xr;
        this.blada_xr = blada_xr;
    }

    @Override
    public String toString() {
        return "\n" +
                "iteracja=" + iteracja +
                ", xl=" + xl +
                ", f(xl)=" + wynikl +
                ", xu=" + xu +
                ", f(xu)=" + wyniku +
                ", dokladnosc=" + dokladnosc +
                ", xr=" + xr +
                ", f(xr)=" + wynikr +
                ", Et=" + bladt_xr +
                ", Ea=" + blada_xr;
    }
}
