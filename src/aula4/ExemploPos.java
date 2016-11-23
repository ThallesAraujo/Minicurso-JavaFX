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
		
		Label label = new Label("Conte�do 1");
		ComboBox combo = new ComboBox();
		combo.getItems().addAll("Conte�do 2", "Item do Conte�do 2");
		Button botao = new Button("Fechar");
		botao.setOnAction(e->Platform.exit());
		
		/**
		 * Definindo o alinhamento no pai, os n�s filhos
		 * o seguir�o e ser�o ordenados automaticamente
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
