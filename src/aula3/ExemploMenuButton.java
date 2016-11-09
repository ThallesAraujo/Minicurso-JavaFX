package aula3;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemploMenuButton extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane painel = new Pane();
		MenuButton mb = new MenuButton("Colar");
		mb.setLayoutX(10);
		mb.setLayoutY(10);
		MenuItem colar = new MenuItem("Colar");
		Menu colarEsp = new Menu ("Colar Especial...");
		MenuItem texto = new MenuItem("Texto");
		MenuItem imagem = new MenuItem("Imagem");
		colarEsp.getItems().addAll(texto,imagem);
		mb.setMinSize(50, 50);
		mb.getItems().addAll(colar,colarEsp);
		painel.getChildren().add(mb);
		Scene cena = new Scene(painel,200,200);
		palco.setScene(cena);
		palco.show();
	}
	
	public static void main(String[] args) {
		launch();
	}

}
