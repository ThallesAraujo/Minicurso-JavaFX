import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ExemploHBox extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		HBox hbox = new HBox(5);
		Label label1 = new Label("R�tulo de \ntexto 1");
		/*Iniciantes: o \n serve para "quebrar" o texto do r�tulo.
		 * O que estiver depois dele ir� para a pr�xima linha de baixo.
		 */
		Label label2 = new Label("R�tulo de \ntexto 2");
		Label label3 = new Label("R�tulo de \ntexto 3");
		hbox.getChildren().addAll(label1,label2,label3);
		Scene cena = new Scene(hbox,200,200);
		palco.setScene(cena);
		palco.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}