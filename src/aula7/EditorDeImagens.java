package aula7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.MotionBlur;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EditorDeImagens extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox raiz = new VBox();
		Button desfoque = new Button("Desfoque");
		Button velocidade = new Button("Desf. Velocidade");
		Button sepia = new Button("Tom de sépia");
		
		ImageView view = new ImageView("/aula7/Green Valey.jpg");
		
		ToolBar toolbar = new ToolBar();
		toolbar.getItems().addAll(desfoque,velocidade,sepia);
		
		desfoque.setOnAction(e->view.setEffect(new BoxBlur(90,90,90)));
		velocidade.setOnAction(e->view.setEffect(new MotionBlur(90,90)));
		sepia.setOnAction(e->view.setEffect(new SepiaTone(40)));
		
		raiz.getChildren().addAll(toolbar,view);
		Scene cena = new Scene(raiz);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
