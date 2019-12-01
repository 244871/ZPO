import javafx.scene.chart.XYChart;

import java.util.ArrayList;

public class Newton {
    public ArrayList<Wyniki2> wyniki2= new ArrayList<>();
    public double lastValue;
    private ScalarFunction func;
    public Newton(ScalarFunction func) {
        this.func = func;
    }


    void solver(double xl, double dok, int maxIter) {

        double xstare=xl;
        for (int i = 0; i <maxIter; i++) {



            wyniki2.add(new Wyniki2 (i+1, xl, oblicz(xl), dokladnosc(xl, obliczxr(xl)), obliczxr(xl), oblicz(obliczxr(xl)), bladT(obliczxr(xl)), bladA(obliczxr(xl), xstare)));

            if (oblicz(obliczxr(xl))*oblicz(xl) < 0) {
                xl = obliczxr(xl);
            } else {
                break;
            }
            xstare=obliczxr(xl);
            if(dokladnosc(xl, obliczxr(xl))<=dok){
                break;
            }
            lastValue = obliczxr(xl);
        }

        System.out.println("Newton");
        System.out.print(wyniki2.toString());
        System.out.println();

    }
    private double oblicz(double x){
        return func.f(x);
    }
    private double bladT(double x){
        return func.bladEt(x);
    }
    private double dokladnosc(double xl, double xr){
        return func.dokJednaWartosc(xl, xr);
    }
    private double obliczxr(double xl){
        return func.fpxn(xl);
    }
    private double bladA( double x, double xstare){
        return ((x-xstare)/(x))*100;
    }
    public ArrayList<XYChart.Data> getChartData(){
        ArrayList<XYChart.Data> data = new ArrayList<>();

        for (int i = 0; i < wyniki2.size(); i++) {
            data.add(new XYChart.Data<>(wyniki2.get(i).bladt_xr, i));
        }
        return data;
    }

    public double getLastValue() {
        return lastValue;
    }
}
