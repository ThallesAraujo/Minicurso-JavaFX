package aula6;
import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

public class ExemploChoiceDialog extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		
		ChoiceDialog dialog = new ChoiceDialog("Opção 1","Opção 1","Opção 2","Opção 3");
		
		dialog.setContentText("Escolha uma opção:");
		Optional opcao = dialog.showAndWait();
		
		System.out.println(opcao.get().toString());
		
	}
	

	public static void main(String[] args) {
		launch();
	}

}
