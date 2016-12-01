package aula6;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.MotionBlur;
import javafx.scene.effect.SepiaTone;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ExemploEfeitos extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox raiz = new VBox(10);
		raiz.setAlignment(Pos.CENTER);
		
		Button desfocagem = new Button("Desfocagem");
		desfocagem.setEffect(new BoxBlur(5,5,5));
		
		raiz.getChildren().add(desfocagem);
		
		Button sepia = new Button("Sépia");
		sepia.setEffect(new SepiaTone(1));
		
		raiz.getChildren().add(sepia);
		
		Button sombra = new Button("Sombra Interna");
		sombra.setEffect(new InnerShadow(10,Color.GREEN));
		raiz.getChildren().add(sombra);
		
		Button velocidade = new Button("Ef. Velocidade");
		velocidade.setEffect(new MotionBlur(90,10));
		raiz.getChildren().add(velocidade);
		
		Button ajuste = new Button("Ajuste de Cor");
		//matiz,saturação,brilho,contraste
		ajuste.setEffect(new ColorAdjust(0.7,0.7,0.7,0.7));
		raiz.getChildren().add(ajuste);
		
		Scene cena = new Scene(raiz,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
