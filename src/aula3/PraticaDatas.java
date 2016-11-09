package aula3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PraticaDatas extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane raiz = new Pane();
		
		DatePicker dpData = new DatePicker();
		
		Label lbDias = new Label("---");
		Label lbMeses = new Label("---");
		Label lbAnos = new Label("---");
		
		dpData.setOnAction(e->{
			
			lbDias.setText(String.valueOf(dpData.getValue().until
					(LocalDate.now(),ChronoUnit.DAYS))+" dias");
			
			lbMeses.setText(String.valueOf(dpData.getValue().until
					(LocalDate.now(),ChronoUnit.MONTHS))+" meses");
			
			lbAnos.setText(String.valueOf(dpData.getValue().until
					(LocalDate.now(),ChronoUnit.YEARS))+" anos");
			
		});
		
		dpData.setLayoutY(5);
		lbDias.setLayoutY(30);
		lbMeses.setLayoutY(60);
		lbAnos.setLayoutY(90);
		
		raiz.getChildren().addAll(dpData,lbDias,lbMeses,lbAnos);
		
		Scene cena = new Scene(raiz,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
