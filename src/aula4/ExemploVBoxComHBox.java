import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploVBoxComHBox extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		VBox raiz = new VBox(10);
		//Label + campo para digitar o nome
		HBox conteinerNome = new HBox(5);
		Label lbNome = new Label("Nome:");
		TextField tfNome = new TextField();
		conteinerNome.getChildren().addAll(lbNome,tfNome);
		
		//Label + campo para digitar o telefone
		HBox conteinerTelefone = new HBox(5);
		Label lbTelefone = new Label("Telefone:");
		TextField tfTelefone = new TextField();
		conteinerTelefone.getChildren().addAll(lbTelefone,tfTelefone);
		
		//Botões
		HBox conteinerBotoes = new HBox(100);
		Button btCancelar = new Button("Cancelar");
		/*Definindo ação do botão rapidamente com uma Lambda Expression
		 * (Platform.exit() é um comando que encerra o programa)
		 */
		btCancelar.setOnAction(e -> Platform.exit());
		Button btSalvar = new Button("Salvar");
		conteinerBotoes.getChildren().addAll(btCancelar,btSalvar);
		
		//Adicionar todos os HBoxes no VBox raiz
		raiz.getChildren().addAll(conteinerNome,conteinerTelefone,conteinerBotoes);
		
		Scene cena = new Scene(raiz,210,100);
		palco.setScene(cena);
		palco.show();
		
		
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	

}
