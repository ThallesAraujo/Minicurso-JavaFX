package aula4;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PraticaAlinhamentos extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox box = new VBox(10);
		
		ComboBox alinhamentos = new ComboBox();
		
		alinhamentos.getItems().addAll(
				"Top_Left","Top_Right","Top_Center",
				"Baseline_Left","Baseline_Right","Baseline_Center",
				"Center","Center_Left","Center_Right",
				"Bottom_Left","Bottom_Right","Bottom_Center");
		alinhamentos.getSelectionModel().select(0);
		
		box.getChildren().add(alinhamentos);
		
		
		alinhamentos.setOnAction(new EventHandler(){

			@Override
			public void handle(Event event) {
				String alinhamento = alinhamentos.getSelectionModel().getSelectedItem().toString();
				
				if(alinhamento.equals("Top_Left")){
					box.setAlignment(Pos.TOP_LEFT);
				}
				if(alinhamento.equals("Top_Right")){
					box.setAlignment(Pos.TOP_RIGHT);
				}
				if(alinhamento.equals("Top_Center")){
					box.setAlignment(Pos.TOP_CENTER);
				}
				if(alinhamento.equals("Baseline_Left")){
					box.setAlignment(Pos.BASELINE_LEFT);
				}
				if(alinhamento.equals("Baseline_Right")){
					box.setAlignment(Pos.BASELINE_RIGHT);
				}
				if(alinhamento.equals("Baseline_Center")){
					box.setAlignment(Pos.BASELINE_CENTER);
				}
				if(alinhamento.equals("Center")){
					box.setAlignment(Pos.CENTER);
				}
				if(alinhamento.equals("Center_Left")){
					box.setAlignment(Pos.CENTER_LEFT);
				}
				if(alinhamento.equals("Center_Right")){
					box.setAlignment(Pos.CENTER_RIGHT);
				}
				if(alinhamento.equals("Bottom_Left")){
					box.setAlignment(Pos.BOTTOM_LEFT);
				}
				if(alinhamento.equals("Bottom_Right")){
					box.setAlignment(Pos.BOTTOM_RIGHT);
				}
				if(alinhamento.equals("Bottom_Center")){
					box.setAlignment(Pos.BOTTOM_CENTER);
				}
			}
			
		});
		
		Scene cena = new Scene(box,200,200);
		palco.setScene(cena);
		palco.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	

}
