package aula4;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploSplitPane extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		SplitPane painel = new SplitPane();
		
		VBox vbAddItens = new VBox(5);
		Label lbAddItens = new Label("Adicionar um Item:");
		TextField tfItem = new TextField();
		Button btAdicionar = new Button("Adicionar à lista");
		
		vbAddItens.getChildren().addAll(lbAddItens,tfItem,btAdicionar);
		painel.getItems().add(vbAddItens);
		
		VBox vbLista = new VBox(2);
		HBox hbItensDaLista = new HBox();
		Label lbItensLista = new Label("Itens Cadastrados:");
		hbItensDaLista.getChildren().add(lbItensLista);
		VBox vbItensLista = new VBox(5);
		ScrollPane scItens = new ScrollPane(vbItensLista);
		vbLista.getChildren().addAll(hbItensDaLista,scItens);
		painel.getItems().add(vbLista);
		
		btAdicionar.setOnAction(new EventHandler(){

			@Override
			public void handle(Event arg0) {
				vbItensLista.getChildren().add(new Label("- "+tfItem.getText()));
			}
		});
		
		Scene cena = new Scene(painel,500,300);
		palco.setScene(cena);
		palco.show();
		
		
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	

}
