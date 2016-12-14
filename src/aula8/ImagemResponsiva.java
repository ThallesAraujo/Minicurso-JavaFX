package aula8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ImagemResponsiva extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane raiz = new Pane();
		ImageView view = new ImageView("/aula8/Paris.jpg");
		raiz.getChildren().add(view);
		view.fitHeightProperty().bind(palco.heightProperty());
		view.fitWidthProperty().bind(palco.widthProperty());
		
		Scene cena = new Scene(raiz);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
