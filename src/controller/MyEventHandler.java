package controller;



import application.Oscilloscope;
import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;

import javafx.event.EventHandler;
import javafx.util.Duration;
import model.Signal;
import model.network.Sensor;
import view.ControlPane;

public class MyEventHandler implements EventHandler<ActionEvent>{

	private ControlPane pane;
	Signal sig = new Signal();
	
	public MyEventHandler(ControlPane pane) {
		this.pane=pane;
    }
	public MyEventHandler(Signal sig) {
		
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		Object source = event.getSource();
	    

		if (source.equals(pane.getButtonStart())) {
			System.out.println("bouton presse = " + source.toString());
			final ScheduledService<Integer> service = new ScheduledService<Integer>() { 
				  
			    @Override 
			    protected Task<Integer> createTask() { 
			        return new Task<Integer>() { 
			        	
			            @Override 
			            protected Integer call() throws Exception { 
			            	
			                int result = 0; 
			                
			                return result; 
			            }                             
			        }; 
			    }                     
			};
			
		}
		else if (source.equals(pane.getButtonStop())) {
		    
		    System.out.println("bouton presse = " + source.toString());
		}
        else if (source.equals(pane.getButtonAcq1())) {
		    
        	System.out.println("bouton presse = " + source.toString());
		}
        else if (source.equals(pane.getButtonNoise1())) {

        	System.out.println("bouton presse = " + source.toString());
		}
        else if (source.equals(pane.getButtonSine1())) {
		    
		    System.out.println("bouton presse = " + source.toString());
		}
        else if (source.equals(pane.getButtonSquare1())) {
		    
		    System.out.println("bouton presse = " + source.toString());
		}
	}
}
	