package view;




import javafx.scene.layout.BorderPane;
import model.Signal;

public class FrontPane extends BorderPane {
	
	public FrontPane(Signal sig) {
		ControlPane control= new ControlPane(sig);
		Screen screen = new Screen();
		this.setRight(control.getControlPane());
		this.setCenter(screen.addValuetoSignal(sig));
	}
	
	
	
}
