import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;


public class ExemploGrow extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		GridPane pane = new GridPane();
	
		Label lbNome = new Label("Nome");
		TextField tfNome = new TextField();
		Button btSalvar = new Button("Salvar");
		
		//Controlando o crescimento horizontal
		pane.setHgrow(tfNome, Priority.ALWAYS);
		
		pane.setVgap(30);
		pane.setHgap(40);
		pane.setAlignment(Pos.CENTER);
		
		
		
		
		HBox box = new HBox();
		box.getChildren().addAll(lbNome,tfNome);
		
		pane.add(lbNome, 0, 0);
		pane.add(tfNome, 1, 0);

		pane.add(btSalvar, 0, 1);
		
		Scene cena = new Scene(pane,250,100);
		palco.setScene(cena);
		palco.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	

}
