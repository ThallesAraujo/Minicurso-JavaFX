package aula2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemploCheckBox extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane raiz = new Pane();
		
		CheckBox cbOpc1 = new CheckBox("Opção 1");
		CheckBox cbOpc2 = new CheckBox("Opção 2");
		CheckBox cbOpc3 = new CheckBox("Opção 3");
		
		//Método de retorno do estado da caixa de seleção
		cbOpc1.isSelected();
		
		cbOpc1.setLayoutY(5);
		cbOpc2.setLayoutY(30);
		cbOpc3.setLayoutY(70);
		
		raiz.getChildren().addAll(cbOpc1,cbOpc2,cbOpc3);
		
		Scene cena = new Scene(raiz,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
