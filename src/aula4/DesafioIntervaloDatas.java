import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DesafioIntervaloDatas extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane raiz = new Pane();
		
		DatePicker dpData = new DatePicker();
		
		Label meses = new Label("---");
		Label dias = new Label("---");
		Label anos = new Label("---");
		
		dpData.setOnAction(e->{
			meses.setText(String.valueOf(dpData.getValue().until(LocalDate.now(),ChronoUnit.MONTHS))+" meses");
			dias.setText(String.valueOf(dpData.getValue().until(LocalDate.now(),ChronoUnit.DAYS))+" dias");
			anos.setText(String.valueOf(dpData.getValue().until(LocalDate.now(),ChronoUnit.YEARS))+" anos");
		});
		
		dpData.setLayoutY(10);
		dias.setLayoutY(40);
		meses.setLayoutY(80);
		anos.setLayoutY(120);
		
		raiz.getChildren().addAll(dpData,dias,meses,anos);
		Scene cena = new Scene(raiz,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	

}
