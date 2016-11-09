package aula3;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemploAcordeon extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Accordion acordeon = new Accordion();
		
		TitledPane painel1 = new TitledPane("Botões",new Button("Botão 1"));
		Pane paineltl1 = new Pane();
		Label label1 = new Label("Texto 1");
		Label label2 = new Label("Texto 2");
		label1.setLayoutX(10);
		label2.setLayoutX(10);
		label1.setLayoutY(10);
		label2.setLayoutY(30);
		paineltl1.getChildren().addAll(label1,label2);
		TitledPane painel2 = new TitledPane("Labels",paineltl1);
		acordeon.getPanes().addAll(painel1,painel2);
		Scene cena = new Scene(acordeon,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
