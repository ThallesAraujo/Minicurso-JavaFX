package aula3;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemploDatePicker extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		// TODO Auto-generated method stub
		
		Pane painel = new Pane();
		DatePicker dp = new DatePicker();
		//retornar a data do DatePicker -> dp.getValue()
		dp.setLayoutX(10);
		dp.setLayoutY(10);
		painel.getChildren().add(dp);
		Scene cena = new Scene(painel,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
