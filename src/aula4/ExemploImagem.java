import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ExemploImagem extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		StackPane raiz = new StackPane();
		
		/*
		 * Aqui a imagem está dentro da pasta do
		 * projeto. Caso não esteja, a String deve
		 * ser o real endereço da imagem
		 */
		ImageView sunshine = new ImageView("/Sunshine.jpg");
		
		raiz.getChildren().addAll(sunshine);
		
		Scene cena = new Scene(raiz);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	

}
