package aula4;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExemploGridPane extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		GridPane raiz = new GridPane();
		
		/*
		 * Como o tamanho da grade não será definido na instanciação,
		 * deve ser utilizado o método add() para adicionar os componentes
		 */
		raiz.add(new Label(" Posição 0 x 0 "), 0, 0);
		raiz.add(new Label(" Posição 0 x 1 "), 0, 1);
		raiz.add(new Label(" Posicao 1 x 0 "), 1, 0);
		raiz.add(new Label(" Posição 1 x 1 "), 1, 1);
		
		Scene cena = new Scene(raiz,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	

}
