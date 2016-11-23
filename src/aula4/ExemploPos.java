package aula4;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploPos extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox parent = new VBox(20);
		
		Label label = new Label("Conteúdo 1");
		ComboBox combo = new ComboBox();
		combo.getItems().addAll("Conteúdo 2", "Item do Conteúdo 2");
		Button botao = new Button("Fechar");
		botao.setOnAction(e->Platform.exit());
		
		/**
		 * Definindo o alinhamento no pai, os nós filhos
		 * o seguirão e serão ordenados automaticamente
		 * de acordo com o mesmo.
		 */
		
		parent.setAlignment(Pos.CENTER_LEFT);
		
		
		parent.getChildren().addAll(label,combo,botao);
		
		Scene cena = new Scene(parent,200,200);
		palco.setScene(cena);
		palco.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	

}
