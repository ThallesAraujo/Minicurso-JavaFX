package aula6;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * Posteriormente, alterar este exemplo para demonstrar
 * o resgate de itens e a exclus�o
 */
public class ExemploList extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox vbox = new VBox(5);
		
		Label lbFrutas = new Label("Frutas:");
		
		ListView lista = new ListView();
		
		lista.getItems().addAll("P�ra","Ma��","Laranja","Uva","Banana","Abacaxi","Abacate","Mam�o",
				"P�ssego","Lim�o","Morango","Jaboticaba","Acerola","Maracuj�");
		
		vbox.getChildren().addAll(lbFrutas,lista);
		
		Scene cena = new Scene(vbox,200,200);
		palco.setScene(cena);
		
		palco.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	

}
