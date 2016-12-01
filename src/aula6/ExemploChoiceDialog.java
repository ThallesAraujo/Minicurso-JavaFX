package aula6;
import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

public class ExemploChoiceDialog extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		
		ChoiceDialog dialog = new ChoiceDialog("Op��o 1","Op��o 1","Op��o 2","Op��o 3");
		
		dialog.setContentText("Escolha uma op��o:");
		Optional opcao = dialog.showAndWait();
		
		System.out.println(opcao.get().toString());
		
	}
	

	public static void main(String[] args) {
		launch();
	}

}
