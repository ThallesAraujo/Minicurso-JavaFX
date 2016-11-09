import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class ExemploAudioClip extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		StackPane pane = new StackPane();
		
		/*
		 * � necess�rio uma String especial no caso do AudioClip.
		 * Caso a URL do arquivo seja passada diretamente, 
		 * uma exce��o pode ser lan�ada. 
		 * 
		 * Alguns formatos de arquivos (como .flac, .ogg, entre outros
		 * n�o s�o suportados (quando isso acontece, uma exce��o � lan�ada)
		 */
		String URL_ARQUIVO = getClass().getResource("/Buckthorn.mp3").toString();
		AudioClip clip = new AudioClip(URL_ARQUIVO);
		
		Label label = new Label("Reproduzindo �udio...");
		pane.getChildren().add(label);
		
		Scene cena = new Scene(pane,200,200);
		palco.setScene(cena);
		
		/*
		 * Colocando o �udio para tocar...
		 */
		clip.play();
		
		
		palco.show();
		
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	
	
	

}
