package aula2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Retangulo extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane raiz = new Pane();
		
		Rectangle retangulo = new Rectangle(100,50);
		retangulo.setFill(Paint.valueOf("Green"));
		
		ComboBox cbCores = new ComboBox();
		cbCores.getItems().addAll("red","pink","blue","yellow","cyan","green");
		cbCores.setOnAction(e->{
			retangulo.setFill(Paint.valueOf(
					cbCores.getSelectionModel().getSelectedItem().toString()));
		});
		retangulo.setLayoutY(10);
		cbCores.setLayoutY(150);
		raiz.getChildren().addAll(retangulo,cbCores);
		
		Scene cena = new Scene(raiz,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
