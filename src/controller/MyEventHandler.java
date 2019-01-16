package controller;



import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import view.ControlPane;

public class MyEventHandler implements EventHandler<ActionEvent>{

	private ControlPane pane;
	

	
	public MyEventHandler(ControlPane pane) {
		this.pane=pane;
    }

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		Object source = event.getSource();
	    

		if (source.equals(pane.getButtonStart())) {
			System.out.println("bouton presse = " + source.toString());
			
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
	