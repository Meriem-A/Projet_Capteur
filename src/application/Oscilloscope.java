package application;
	


import com.rapplogic.xbee.api.XBee;
import com.rapplogic.xbee.api.XBeeException;
import com.rapplogic.xbee.api.wpan.IoSample;
import com.rapplogic.xbee.api.wpan.RxResponseIoSample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import view.FrontPane;
import model.Signal;
import model.network.Sensor;
import javafx.scene.Scene;



public class Oscilloscope extends Application {
	
	public static Signal sig = new Signal();
	
	public void init() {	
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//Signal sig = new Signal(TypeSig.SINE);
			//BorderPane root = new BorderPane();
			FrontPane root = new FrontPane(sig);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	
	public static void main(String[] args) {
	

		Sensor capteur= new Sensor(sig);
		capteur.setPeriod(Duration.seconds(1));
		capteur.start();
		sig=capteur.getSignal();
		
		launch(args);
		

		
		
	}
}
