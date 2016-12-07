package aula7;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Browser extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox vbox = new VBox();
		HBox raiz = new HBox();
		
		ToolBar hbEndereco = new ToolBar();
		TextField tfEndereco = new TextField();
		Button btCarregar = new Button("Carregar");
		ComboBox cbHistorico = new ComboBox();
		
		hbEndereco.getItems().addAll(tfEndereco,btCarregar,cbHistorico);
		
		WebView view = new WebView();
		WebEngine engine = view.getEngine();
		vbox.getChildren().addAll(hbEndereco,view);
		raiz.getChildren().add(vbox);
		vbox.setVgrow(view, Priority.ALWAYS);
		raiz.setHgrow(vbox, Priority.ALWAYS);
		
		
		
		btCarregar.setOnAction(e->{
			engine.load("http://"+tfEndereco.getText());
			cbHistorico.getItems().add(tfEndereco.getText());
		});
		
		Scene cena = new Scene(raiz);
		palco.setScene(cena);
		palco.show();
		
		
	}

	public static void main(String[] args) {
		launch();
	}
}
