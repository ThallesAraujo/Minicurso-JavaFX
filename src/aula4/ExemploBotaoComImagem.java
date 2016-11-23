package aula4;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploBotaoComImagem extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox vbox = new VBox(10);
		
		Button ideia = new Button("Tive uma ideia!");
		Button pergunta = new Button("O que eu faço agora?");
		
		ideia.setGraphic(new ImageView("/dialog-information.png"));
		pergunta.setGraphic(new ImageView("/dialog-question.png"));
		
		ideia.setContentDisplay(ContentDisplay.TOP);		
		vbox.getChildren().addAll(ideia,pergunta);
		vbox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vbox,200,200);
		palco.setScene(scene);
		palco.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
