package aula5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class ExemploMediaView extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox raiz = new VBox();
		raiz.setAlignment(Pos.CENTER);
		
		String URL_VIDEO = getClass().getResource("/aula5/video1.mp4").toString();
		
		Media video = new Media(URL_VIDEO);
		
		MediaPlayer player = new MediaPlayer(video);
		
		MediaView view = new MediaView(player);
		
		raiz.getChildren().add(view);
		
		Scene cena = new Scene(raiz,500,500);
		
		palco.setScene(cena);
		palco.show();
		
		player.play();
		player.setVolume(0);
	}
	
	public static void main(String[] args) {
		launch();
	}

}
