package aula3;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemploSeparadorV extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		Pane painel = new Pane();
		Label label = new Label ("Vertical:");
		Separator separador = new Separator();
		separador.setOrientation(Orientation.VERTICAL);
		label.setLayoutX(70);
		label.setLayoutY(10);
		separador.setLayoutX(90);
		separador.setLayoutY(40);
		separador.setMinSize(1, 125);
		painel.getChildren().addAll(label,separador);
		Scene cena = new Scene(painel,200,200);
		palco.setScene(cena);
		palco.show();
		
		
	}
	
	public static void main(String[] args) {
		
		launch();
		
	}
}
	