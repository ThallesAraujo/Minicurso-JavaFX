package aula3;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemploSeparatorH extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		Pane painel = new Pane();
		Label label = new Label ("Horizontal:");
		Separator separador = new Separator();
		separador.setOrientation(Orientation.HORIZONTAL);
		label.setLayoutX(10);
		label.setLayoutY(80);
		separador.setLayoutX(70);
		separador.setLayoutY(90);
		separador.setMinSize(125, 1);
		painel.getChildren().addAll(label,separador);
		Scene cena = new Scene(painel,200,200);
		palco.setScene(cena);
		palco.show();
		
		
	}
	
	public static void main(String[] args) {
		
		launch();
		
	}
	
	

}
