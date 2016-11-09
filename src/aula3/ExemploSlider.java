package aula3;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemploSlider extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane painel = new Pane();
		Slider slider = new Slider();
		slider.setLayoutX(10);
		slider.setLayoutY(90);
		painel.getChildren().add(slider);
		Scene cena = new Scene(painel,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
