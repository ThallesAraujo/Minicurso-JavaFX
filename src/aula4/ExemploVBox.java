package aula4;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploVBox extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox vbox = new VBox(25);
		
		
		
		Label label1 = new Label("Rótulo de texto 1");
		Label label2 = new Label("Rótulo de texto 2");
		Label label3 = new Label("Rótulo de texto 3");
		vbox.getChildren().addAll(label1,label2,label3);
		Scene cena = new Scene(vbox,200,200);
		palco.setScene(cena);
		palco.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
