package aula4;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploTabPane extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		TabPane painel = new TabPane();
		painel.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		
		
		Tab abaBotoes = new Tab("Botões");
		Tab abaLabels = new Tab("Labels");
		
		VBox vbBotoes = new VBox(5);
		VBox vbLabels = new VBox(5);
		
		vbBotoes.getChildren().addAll(new Button("Botão 1"),new Button("Botão 2"),new Button("Botão 3"));
		vbLabels.getChildren().addAll(new Label("Label 1"), new Label("Label 2"), new Label("Label 3"));
		
		abaBotoes.setContent(vbBotoes);
		abaLabels.setContent(vbLabels);
		
		painel.getTabs().addAll(abaBotoes,abaLabels);
		Scene cena = new Scene(painel,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
