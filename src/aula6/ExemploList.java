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
 * o resgate de itens e a exclusão
 */
public class ExemploList extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox vbox = new VBox(5);
		
		Label lbFrutas = new Label("Frutas:");
		
		ListView lista = new ListView();
		
		lista.getItems().addAll("Pêra","Maçã","Laranja","Uva","Banana","Abacaxi","Abacate","Mamão",
				"Pêssego","Limão","Morango","Jaboticaba","Acerola","Maracujá");
		
		vbox.getChildren().addAll(lbFrutas,lista);
		
		Scene cena = new Scene(vbox,200,200);
		palco.setScene(cena);
		
		palco.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	

}
