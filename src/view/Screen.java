package view;



import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import model.Signal;

public class Screen{
	
	NumberAxis xAxis = new NumberAxis();
	NumberAxis yAxis = new NumberAxis();
	LineChart<Number,Number> chart=new LineChart<Number,Number>(xAxis,yAxis);
	//XYChart.Series<Number,Number> series = new XYChart.Series<Number,Number>();
	
	public Screen() {
		xAxis.setAutoRanging(true);
		yAxis.setAutoRanging(true);
		
	}

	LineChart<?, ?> addValuetoSignal(Signal sig) {
		chart.getData().add(sig.getSeries());
		return chart;
	}



	/*
	LineChart<?, ?> test() {
		series.getData().add(new XYChart.Data<Number,Number>(1, 23));
        series.getData().add(new XYChart.Data<Number,Number>(2, 14));
        series.getData().add(new XYChart.Data<Number,Number>(3, 15));
        series.getData().add(new XYChart.Data<Number,Number>(4, 24));
        series.getData().add(new XYChart.Data<Number,Number>(5, 34));
        series.getData().add(new XYChart.Data<Number,Number>(6, 36));
        series.getData().add(new XYChart.Data<Number,Number>(7, 22));
        series.getData().add(new XYChart.Data<Number,Number>(8, 45));
        series.getData().add(new XYChart.Data<Number,Number>(9, 43));
        series.getData().add(new XYChart.Data<Number,Number>(10, 17));
        series.getData().add(new XYChart.Data<Number,Number>(11, 29));
        series.getData().add(new XYChart.Data<Number,Number>(12, 25));
        chart.getData().add(series);
        return chart;
        }*/
	
	
}

