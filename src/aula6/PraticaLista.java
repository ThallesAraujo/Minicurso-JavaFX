package aula6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PraticaLista extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox raiz = new VBox(5);
		TextField tfItem = new TextField();
		Button btAdicionar = new Button("Adicionar");
		Button btRemover = new Button("Remover");
		ListView lvItens = new ListView();
		
		raiz.getChildren().addAll(tfItem,btAdicionar,btRemover,lvItens);
		
		btAdicionar.setOnAction(e->{
			lvItens.getItems().add(tfItem.getText());
		});
		
		btRemover.setOnAction(e->{
			lvItens.getItems().remove(
					lvItens.getSelectionModel().getSelectedItem());
		});
		
		Scene cena = new Scene(raiz);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}
}
