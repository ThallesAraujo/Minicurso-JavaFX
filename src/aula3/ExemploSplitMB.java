package aula3;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemploSplitMB extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane painel = new Pane();
		SplitMenuButton smb = new SplitMenuButton();
		smb.setText("Pedir Café");
		MenuItem cl = new MenuItem("Café com leite");
		MenuItem cpc = new MenuItem("Capuccino");
		MenuItem cac = new MenuItem("Café com creme");
		
		smb.getItems().addAll(cl,cpc,cac);
		smb.setLayoutX(10);
		smb.setLayoutY(10);
		smb.setMinSize(50, 50);
		
		painel.getChildren().add(smb);
		Scene cena = new Scene(painel,200,200);
		palco.setScene(cena);
		palco.show();
	}
	
	public static void main(String[] args) {
		
		launch();
		
	}

}
