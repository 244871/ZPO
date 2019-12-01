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
        int bound = 30; //
        final NumberAxis xAxis = new NumberAxis(-bound,bound,10);
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("x");
        yAxis.setLabel("f(x)");
        yAxis.setTickUnit(2);

        final LineChart<Number,Number> chart = new LineChart(xAxis,yAxis);
        XYChart.Series<Number,Number> series = new XYChart.Series();
        series.setName("\uD835\uDC53(\uD835\uDC65) = −0,5\uD835\uDC65^2 + " + "2,5\uD835\uDC65 + 4,5"); //skopiowane z listy
        for(int i = -bound; i<bound; i++){
            double temp = -0.5*Math.pow(i,2)+2.5*i+4.5; //wzór trójmianu
            series.getData().add(new XYChart.Data(i,temp));
        }

        Scene scena = new Scene(chart,1000,800);
        chart.getData().addAll(series);
        chart.setCreateSymbols(false);
        primaryStage.setScene(scena);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
