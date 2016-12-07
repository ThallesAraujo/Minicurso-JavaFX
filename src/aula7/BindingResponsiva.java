package aula7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BindingResponsiva extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		AnchorPane raiz = new AnchorPane();
		TextField tfTexto = new TextField();
		raiz.getChildren().add(tfTexto);
		raiz.setLeftAnchor(tfTexto, 1.0);
		tfTexto.prefWidthProperty().bind(palco.widthProperty());
		Scene cena = new Scene(raiz);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
