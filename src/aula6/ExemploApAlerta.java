package aula6;
import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class ExemploApAlerta extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Alert alerta = new Alert(AlertType.CONFIRMATION);
		alerta.setHeaderText("Cabe�alho");
		alerta.setTitle("T�tulo");
		alerta.setContentText("Mensagem de Confirma��o");
		Optional op = alerta.showAndWait();
		
		//Retornando a resposta (bot�o clicado)
		if(op.get().equals(ButtonType.CANCEL)){
			System.out.println("Cancelou");
		}else{
			System.out.println("Ok");
		}
		
	}

	public static void main(String[] args) {
		launch();
	}
	
	
}
