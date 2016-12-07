package aula7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploCSS extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox raiz = new VBox(5);
		raiz.setPadding(new Insets(5,5,5,5));
		TextField tfTexto = new TextField();
		Button btPrincipal = new Button("Teste");
		raiz.getChildren().addAll(tfTexto,btPrincipal);
		
		Scene cena = new Scene(raiz);
		cena.getStylesheets().add("/aula7/estilo.css");
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
