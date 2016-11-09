import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ExemploFlowPane extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		FlowPane painel = new FlowPane();
		
		for(int i = 1; i<=10; i++){
			painel.getChildren().add(new Label("Rótulo "+i+" "));
		}
		
		Scene cena = new Scene(painel,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	
	public static void main(String[] args) {
		launch();
	}
	
	

}
