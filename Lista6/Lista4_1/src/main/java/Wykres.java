import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Wykres extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {


        int liczbaIteracji = 50;
        RegulaFalsi regulaFalsi = new RegulaFalsi(new TestFunction());
        regulaFalsi.solver(0.5, 1.2, 0.01, liczbaIteracji);

        Bisection bisection = new Bisection(new TestFunction());
        bisection.solver(0.5, 0.9, 0.01, liczbaIteracji);

        FixedPiont fixedPiont = new FixedPiont(new TestFunction());
        fixedPiont.solver(0.3,  0.01, liczbaIteracji);

        Newton newton = new Newton(new TestFunction());
        newton.solver(0.3, 0.01, liczbaIteracji);

        Sieczne sieczne = new Sieczne(new TestFunction());
        sieczne.solver(0.9, 0.6, 0.01, liczbaIteracji);

        final NumberAxis xAxis = new NumberAxis(); //lowerBound,upperBound,0.01
        final NumberAxis yAxis = new NumberAxis(0, 15, 1);
        xAxis.setLabel("iteracja");
        yAxis.setLabel("log εt");

        final LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        XYChart.Series<Number, Number> seriesB = new XYChart.Series<>();
        seriesB.setName("Bisection");
        XYChart.Series<Number, Number> seriesF = new XYChart.Series<>();
        seriesF.setName("Fixed Point Iteration");
        XYChart.Series<Number, Number> seriesN = new XYChart.Series<>();
        seriesN.setName("NewtonRaphson");
        XYChart.Series<Number, Number> seriesR = new XYChart.Series<>();
        seriesR.setName("Regula Falsi");
        XYChart.Series<Number, Number> seriesS = new XYChart.Series<>();
        seriesS.setName("Secant");

        for (XYChart.Data data : bisection.getChartData()
                ) {
            seriesB.getData().add(data);
        }

        for (XYChart.Data data : fixedPiont.getChartData()
                ) {
            seriesF.getData().add(data);
        }

        for (XYChart.Data data : newton.getChartData()
                ) {
            seriesN.getData().add(data);
        }
        for (XYChart.Data data : regulaFalsi.getChartData()
                ) {
            seriesR.getData().add(data);
        }
        for (XYChart.Data data : sieczne.getChartData()
                ) {
            seriesS.getData().add(data);
        }

        /*for (int i = 0; i < liczbaIteracji; i++) {
            seriesB.getData().add(new XYChart.Data<>(bisection.wyniki.get(i).bladt_xr, i));
            seriesF.getData().add(new XYChart.Data<>(fixedPiont.wyniki2.get(i).bladt_xr, i));
            seriesN.getData().add(new XYChart.Data<>(newton.wyniki2.get(i).bladt_xr, i));
            seriesR.getData().add(new XYChart.Data<>(regulaFalsi.wyniki.get(i).bladt_xr, i));
        }

        for (int i = 0; i < sieczne.wyniki.size(); i++) {
            seriesS.getData().add(new XYChart.Data<>(sieczne.wyniki.get(i).bladt_xr, i));
        }*/

        Scene scena = new Scene(chart, 1600, 800);
        chart.getData().addAll(seriesB, seriesS, seriesF, seriesN, seriesR);
        chart.setCreateSymbols(false);
        primaryStage.setScene(scena);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}