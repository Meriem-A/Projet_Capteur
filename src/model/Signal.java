package model;

import java.util.ArrayList;


import javafx.scene.chart.XYChart;




public class Signal {
	
	ArrayList<Double> sampleX= new ArrayList<Double>();
	ArrayList<Double> sampleY= new ArrayList<Double>();
	XYChart.Series<Number,Number> series = new XYChart.Series<Number,Number>();
	Signal sig;
	
	int fech;
	int nbq;
	String[] unit= {"s","ms","V","mV"};
	public enum TypeSig{NOISE, SINE,SQUARE};
	
	public Signal() {

	}
	
	public Signal(TypeSig type) {
	
		switch (type) {
		case NOISE:
			for (int k=0;k<100;k++){
				this.addValue(k,((Math.random())%2)-1);
				System.out.printf("%f",this.getY(k));
			}
			break;
            
		case SINE:
			for (int k=0;k<100;k++){
				this.addValue(k,Math.sin(2*Math.PI*k*0.1));
			}
			break;
                 
		case SQUARE:
			for (int k=0;k<10;k++){
				this.addValue(k-0.5,1);
				this.addValue(k,0);
			}
			break;
		}
	}
	
	public double[] getValue(int a){
		double x= (double)sampleX.get(a);
		double y= (double)sampleY.get(a);
		double[] list= {x,y};
		return list;
	}
	
	public double getX(int a) {
		double x= (double)sampleX.get(a);
		return x;
	}
	public double getY(int a) {
		double y= (double)sampleY.get(a);
		return y;
	}
	
	public void setValue(int a,double x,double y) {
		sampleX.set(a,x);
		sampleY.set(a,y);
	}
	
	public void addValue(double x,double y) {
		sampleX.add(x);
		sampleY.add(y);
		series.getData().add(new XYChart.Data<Number,Number>(x,y));
	}
	
	public int sizeData() {
		int size = sampleX.size();
		return size;
	}
	
	public XYChart.Series<Number,Number> getSeries(){
		return series;
	}
	
	public void test() {
		for (int k=0;k<10;k++){
			this.addValue(k,Math.pow(k,2));
		}
	}
}
