package view;




import javafx.scene.layout.BorderPane;
import model.Signal;

public class FrontPane extends BorderPane {

	static ControlPane control= new ControlPane();
	static Screen screen = new Screen();
	
	public FrontPane(Signal sig) {
		this.setRight(control.getControlPane());
		this.setCenter(screen.addValuetoSignal(sig));
	}
	
	
	
}
