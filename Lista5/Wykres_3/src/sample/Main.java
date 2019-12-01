package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Pierwiastki trójmianu");

        //robimy wykres
        int lowerBound = 1;
        int upperBound = 2;
        final NumberAxis xAxis = new NumberAxis(lowerBound,upperBound,0.01);
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("x");
        yAxis.setLabel("f(x)");
        yAxis.setTickUnit(0.5);

        final LineChart<Number,Number> chart = new LineChart(xAxis,yAxis);
        XYChart.Series<Number,Number> series = new XYChart.Series();
        series.setName("\uD835\uDC53(\uD835\uDC65) = \uD835\uDC65^3 + \uD835\uDC65^2 − 3\uD835\uDC65 − 3\n"); //skopiowane z listy
        for(int i = 100; i>0; i--){
            double tempp = lowerBound+1/(double)i;
            System.out.println(tempp);
            double temp = Math.pow(tempp,3)+Math.pow(tempp,2)-3*tempp-3; //wzór trójmianu
            series.getData().add(new XYChart.Data(tempp,temp));
        }

        Scene scena = new Scene(chart,1600,800);
        chart.getData().addAll(series);
        chart.setCreateSymbols(false);
        primaryStage.setScene(scena);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
