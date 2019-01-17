package view;

import javafx.event.ActionEvent;


import controller.MyEventHandler;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Signal;


public class ControlPane extends VBox{

	VBox ch1 = new VBox();
	Text text1= new Text("Chaine 1");
	VBox ch2 = new  VBox();
	HBox hbox = new HBox();
	
	Button mButtonStart=new Button("Start");
	Button mButtonStop=new Button("Stop");
	
	Button mAcq1=new Button("Acq");
	Button mSine1=new Button("Sine");
	Button mSquare1=new Button("Square");
	Button mNoise1=new Button("Noise");
	
	
	public ControlPane() {
		hbox.getChildren().addAll(mButtonStart,mButtonStop);
		ch1.getChildren().addAll(text1,mAcq1,mSine1,mSquare1,mNoise1);
		this.getChildren().addAll(hbox,ch1);
		
		mButtonStart.addEventHandler(ActionEvent.ACTION,new MyEventHandler(this));
		mButtonStop.addEventHandler(ActionEvent.ACTION,new MyEventHandler(this));
		mAcq1.addEventHandler(ActionEvent.ACTION,new MyEventHandler(this));
		mSine1.addEventHandler(ActionEvent.ACTION,new MyEventHandler(this));
		mSquare1.addEventHandler(ActionEvent.ACTION,new MyEventHandler(this));
		mNoise1.addEventHandler(ActionEvent.ACTION,new MyEventHandler(this));
	}
	
	public ControlPane(Signal sig) {
		hbox.getChildren().addAll(mButtonStart,mButtonStop);
		ch1.getChildren().addAll(text1,mAcq1,mSine1,mSquare1,mNoise1);
		this.getChildren().addAll(hbox,ch1);
		
		mButtonStart.addEventHandler(ActionEvent.ACTION,new MyEventHandler(sig));
		mButtonStop.addEventHandler(ActionEvent.ACTION,new MyEventHandler(sig));
		mAcq1.addEventHandler(ActionEvent.ACTION,new MyEventHandler(sig));
		mSine1.addEventHandler(ActionEvent.ACTION,new MyEventHandler(sig));
		mSquare1.addEventHandler(ActionEvent.ACTION,new MyEventHandler(sig));
		mNoise1.addEventHandler(ActionEvent.ACTION,new MyEventHandler(sig));
	}
	
	public Button getButtonStart() {
		return mButtonStart;
	}

	public Button getButtonStop() {
		return mButtonStop;
	}
	
	public Button getButtonAcq1() {
		return mAcq1;
	}
	public Button getButtonNoise1() {
		return mNoise1;
	}
	public Button getButtonSine1() {
		return mSine1;
	}
	public Button getButtonSquare1() {
		return mSquare1;
	}
	
	VBox getControlPane() {
		return this;
	}
	
}
