package fxml;
	
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application implements Initializable{
	
	@FXML
	private VBox raiz;
	
	@FXML
	private TextField tfNumero1;
	
	@FXML
	private TextField tfNumero2;
	
	@FXML
	private Label lbResultado;
	
	@FXML
	private Button btSomar;
	
	public void start(Stage palco) {
		
		try {
			raiz = FXMLLoader.load(getClass().getResource("Layout.fxml"));
			Scene cena = new Scene(raiz);
			palco.setScene(cena);
			palco.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
	public void initialize(URL arg0, ResourceBundle arg1) {
		btSomar.setOnAction(e->{
			int resultado = Integer.parseInt(tfNumero1.getText())+Integer.parseInt(tfNumero2.getText());
			lbResultado.setText("Resultado: "+resultado);
		});
	}
}
