package model.network;

import com.rapplogic.xbee.api.XBee;
import com.rapplogic.xbee.api.XBeeException;
import com.rapplogic.xbee.api.wpan.IoSample;
import com.rapplogic.xbee.api.wpan.RxResponseIoSample;

import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import model.Signal;


public class Sensor extends ScheduledService<Signal>{
	Signal sig = new Signal();
	double value;
	static double t=0;
	double val;
	XBee xBee = new XBee();
	
	
	public Sensor(Signal sig) {
		
	

		System.out.println("ok");
		try {
			xBee.open("COM6", 115200);
			System.out.println("ok");
			
			
		} catch (XBeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("exception");
		}
		
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
					
					//System.out.println(t);
					RxResponseIoSample response =(RxResponseIoSample) xBee.getResponse();
					IoSample[] sample = response.getSamples();
						System.out.println("received response " + sample[sample.length-1].getAnalog0());
						sig.addValue(t, sample[sample.length-1].getAnalog0());
					
					
					
					
				return sig;
			}
		};		
	}
}
