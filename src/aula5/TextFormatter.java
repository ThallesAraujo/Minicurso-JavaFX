package aula5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TextFormatter extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox raiz = new VBox(5);
		HBox hbBotoes = new HBox(5);
		hbBotoes.setPadding(new Insets(5,5,5,5));
		
		Button negrito = new Button("Negrito");
		
		Button italico = new Button("Itálico");
		
		Button negritoItalico = new Button("Negrito + Itálico");
		
		ComboBox cbFontes = new ComboBox();
		cbFontes.getItems().addAll("Segoe UI","Arial",
				"Times New Roman","Calibri","Trebuchet MS");
		
		TextArea taTexto = new TextArea();
		taTexto.setPadding(hbBotoes.getInsets());
		taTexto.setWrapText(true);
		VBox.setVgrow(taTexto, Priority.ALWAYS);
		
		cbFontes.getSelectionModel().select(0);
		cbFontes.setOnAction(e->{
			taTexto.setFont(new Font(cbFontes.getSelectionModel().getSelectedItem().toString(),14));
		});
		
		
		raiz.getChildren().addAll(hbBotoes,taTexto);
		
		negrito.setOnAction(e->{
			taTexto.setFont(new Font(cbFontes.getSelectionModel().getSelectedItem().toString()+" Bold",14));
		});
		
		italico.setOnAction(e->{
			taTexto.setFont(new Font(cbFontes.getSelectionModel().getSelectedItem().toString()+" Italic",14));
		});
		
		negritoItalico.setOnAction(e->{
			taTexto.setFont(new Font(cbFontes.getSelectionModel().getSelectedItem().toString()+" Bold Italic",14));
		});
		
		hbBotoes.getChildren().addAll(negrito,italico,negritoItalico,cbFontes);
		Scene cena = new Scene(raiz,500,500);
		palco.setScene(cena);
		palco.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
