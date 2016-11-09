package aula2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AplicacaoDeSoma extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane raiz = new Pane();
		
		ComboBox cbNumeroUm = new ComboBox();
		ComboBox cbNumeroDois = new ComboBox();
		
		for(int i = 0;i<10;i++){
			cbNumeroUm.getItems().add(i);
			cbNumeroDois.getItems().add(i);
		}
		
		Label resultado = new Label();
		
		cbNumeroUm.getSelectionModel().select(0);
		cbNumeroDois.getSelectionModel().select(0);
		
		cbNumeroUm.setOnAction(e->{
			resultado.setText("Resultado: "+(Integer.parseInt(
					cbNumeroUm.getSelectionModel().getSelectedItem().toString())+
					Integer.parseInt(
					cbNumeroDois.getSelectionModel().getSelectedItem().toString())));
		});
		
		cbNumeroDois.setOnAction(cbNumeroUm.getOnAction());
		
		cbNumeroUm.setLayoutY(5);
		cbNumeroDois.setLayoutY(50);
		resultado.setLayoutY(100);
		
		raiz.getChildren().addAll(cbNumeroUm,cbNumeroDois,resultado);
		
		Scene cena = new Scene(raiz,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	

}
