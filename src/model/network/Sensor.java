package model.network;

import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import model.Signal;


public class Sensor extends ScheduledService<Signal>{
	Signal sig = new Signal();
	double value;
	static double t=0;
	
	public Sensor(Signal sig) {
		this.sig=sig;
	}
	
	public final Signal getSignal() {
		return sig;
	}
	@Override
	protected Task<Signal> createTask() {
		// TODO Auto-generated method stub
		return new Task<Signal>(){
			@Override
			protected Signal call() throws Exception {
				// TODO Auto-generated method stub
					value=Math.random();
					t++;
					sig.addValue(t, value);
					System.out.println(t);
				return sig;
			}
		};		
	}
}
