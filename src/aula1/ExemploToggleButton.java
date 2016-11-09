package aula1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemploToggleButton extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane raiz = new Pane();
		
		ToggleButton btOpcao1 = new ToggleButton("Opção 1");
		ToggleButton btOpcao2 = new ToggleButton("Opção 2");
		ToggleButton btOpcao3 = new ToggleButton("Opção 3");
		
		ToggleGroup grupo = new ToggleGroup();
		
		grupo.getToggles().addAll(btOpcao1,btOpcao2,btOpcao3);
		
		btOpcao1.setLayoutY(10);
		btOpcao2.setLayoutY(40);
		btOpcao3.setLayoutY(70);
		
		Label lbSelect = new Label();
		lbSelect.setLayoutY(100);
		grupo.selectToggle(btOpcao1);
		
		//Método para retornar o botão selecionado
		lbSelect.setText(grupo.getSelectedToggle().toString());
		
		raiz.getChildren().addAll(btOpcao1,btOpcao2,btOpcao3,lbSelect);
		Scene cena = new Scene(raiz,200,200);
		palco.setScene(cena);
		palco.show();
		
	}

	
	public static void main(String[] args) {
		launch();
	}
}
