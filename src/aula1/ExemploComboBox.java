package aula1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemploComboBox extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane raiz = new Pane();
		
		ComboBox combo = new ComboBox();
		Label selecionado = new Label();
		selecionado.setTooltip(new Tooltip("Texto de ajuda"));
		combo.getItems().addAll("Item 1","Item 2","Item 3");
		combo.getSelectionModel().select(0);
		combo.setLayoutX(5);
		combo.setLayoutY(10);
		selecionado.setLayoutX(5);
		selecionado.setLayoutY(40);
		combo.setOnAction(e-> 
		selecionado.setText(combo.getSelectionModel().getSelectedItem().toString()));
		raiz.getChildren().addAll(combo,selecionado);
		Scene cena = new Scene(raiz,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	

}
