import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ExemploInsets extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox parent = new VBox();
		parent.setAlignment(Pos.CENTER);
		
		Button botao = new Button("Botão com Insets");
		botao.setOnAction(e->Platform.exit());
		
		Insets margens = new Insets(0,0,23,0);
		botao.setPadding(margens);
		
		
		//top,right,bottom,left
		parent.getChildren().add(botao);
		
		Scene cena = new Scene(parent,200,200);
		palco.setScene(cena);
		palco.show();
		
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
