package aula2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemploRadioButton extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane raiz = new Pane();
		
		ToggleGroup grupo = new ToggleGroup();
		
		RadioButton btOpc1 = new RadioButton("Opção 1");
		
		RadioButton btOpc2 = new RadioButton("Opção 2");
		
		RadioButton btOpc3 = new RadioButton("Opção 3");
		
		grupo.getToggles().addAll(btOpc1,btOpc2,btOpc3);
		
		btOpc1.setLayoutY(5);
		btOpc2.setLayoutY(20);
		btOpc3.setLayoutY(40);
		
		raiz.getChildren().addAll(btOpc1,btOpc2,btOpc3);
		
		Scene cena = new Scene(raiz,200,200);
		palco.setScene(cena);
		palco.show();
	}
	
	public static void main(String[] args) {
		launch();
	}

}
