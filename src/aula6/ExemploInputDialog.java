package aula6;
import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class ExemploInputDialog extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		TextInputDialog dialog = new TextInputDialog();
		dialog.setContentText("Digite seu nome:");
		dialog.show();
		
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	

}
