package aula6;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploTabela extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox vbox = new VBox(10);
		
		Label lbMusicas = new Label("Músicas:");
		
		/*
		 * A instanciação da TableView segue o modelo
		 * new TableView<Objeto>
		 */
		TableView<Musica> tabela =  new TableView<Musica>();
		
		/*
		 * Para a instanciação das colunas das tabelas, o formato é
		 * new TableColumn<Objeto,TipoDeAtributoDaColuna>("Nome da Coluna").
		 * No exemplo, cada item da música é uma String, por isso o par é
		 * Musica,String.
		 */
		TableColumn<Musica,String> titulo = new TableColumn<Musica,String>("Título");
		TableColumn<Musica,String> album = new TableColumn<Musica,String>("Álbum");
		TableColumn<Musica,String> artista = new TableColumn<Musica,String>("Artista");
		
		titulo.setCellValueFactory(new PropertyValueFactory<Musica,String>("titulo"));
		album.setCellValueFactory(new PropertyValueFactory<Musica,String>("album"));
		artista.setCellValueFactory(new PropertyValueFactory<Musica,String>("artista"));
		
		/*
		 * Adicionamos as colunas na tabela...
		 */
		tabela.getColumns().addAll(titulo,artista,album);
		
		/*
		 * E para povoar a tabela com músicas, criamos um ArrayList 
		 * de músicas e colocamos algumas músicas nele.
		 */
		ArrayList<Musica> musicas = new ArrayList<Musica>();
		musicas.add(new Musica("Nehalennia","Armin van Buuren vs Arty","A State Of Trance 2013"));
		musicas.add(new Musica("Sansa","Gareth Emery","100 Reasons to Live"));
		musicas.add(new Musica("Northern Aura","Tritonal","Lights Over Austin/Northern Aura"));
		musicas.add(new Musica("For An Angel","Paul van Dyk","For An Angel"));
		
		/*
		 * Aqui, definimos os itens que povoarão a tabela.
		 */
		tabela.getItems().addAll(musicas);
		
		vbox.getChildren().addAll(lbMusicas,tabela);
		
		Scene cena = new Scene(vbox,440,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
