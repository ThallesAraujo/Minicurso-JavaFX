package aula2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemploTextArea extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane raiz = new Pane();
		TextArea taTexto = new TextArea();
		//determinar quebra de linhas
		taTexto.setWrapText(true);
		
		raiz.getChildren().add(taTexto);
		
		Scene cena = new Scene(raiz,400,400);
		palco.setScene(cena);
		palco.show();
		
	}

	public static void main(String[] args) {
		launch();
	}
}
