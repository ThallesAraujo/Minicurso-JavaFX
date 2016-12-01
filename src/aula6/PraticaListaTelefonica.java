package aula6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/*
 * Já modificada com a prática + componente personalizado de seleção
 */
public class PraticaListaTelefonica extends Application{
	
	static ObservableList<Contato> conts = FXCollections.observableArrayList();
	static TableView<Contato> contatos = new TableView<Contato>();
	@Override
	public void start(Stage palco) throws Exception {
		
		VBox raiz = new VBox(5);
		raiz.setVgrow(contatos, Priority.ALWAYS);
		ToolBar tbBotoes = new ToolBar();
		Button btAdd = new Button("Adicionar Contato");
		Button btRemover = new Button("Remover Contato");
		
		btAdd.setOnAction(e-> new JanelaAddContato());
		btRemover.setOnAction(e->new JanelaRemoverContato());
		
		tbBotoes.getItems().addAll(btAdd,btRemover);
		
		
		TableColumn<Contato,String> clNome = 
				new TableColumn<Contato,String>("Nome");
		
		TableColumn<Contato,String> clEmail =
				new TableColumn<Contato,String>("E-mail");
		
		TableColumn<Contato,Integer> clTelefone =
				new TableColumn<Contato,Integer>("Telefone");
		
		clNome.setCellValueFactory(
				new PropertyValueFactory<Contato,String>("nome"));
		clEmail.setCellValueFactory(
				new PropertyValueFactory<Contato,String>("email"));
		clTelefone.setCellValueFactory(
				new PropertyValueFactory<Contato,Integer>("telefone"));
		
		contatos.getColumns().addAll(clNome,clEmail,clTelefone);
		
		
		contatos.getItems().addAll(conts);
		
		raiz.getChildren().addAll(tbBotoes,contatos);
		Scene cena = new Scene(raiz);
		palco.setScene(cena);
		palco.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	public void atualizarTabela(){
		contatos.setItems(null);
		contatos.setItems(conts);
	}
	
	public class JanelaAddContato extends Stage{
		
		public JanelaAddContato(){
			
			VBox raiz = new VBox();
			Label lbNome = new Label("Nome:");
			TextField tfNome = new TextField();
			Label telefone = new Label("Telefone:");
			TextField tfTelefone = new TextField();
			Label lbEmail = new Label("E-mail");
			TextField tfEmail = new TextField();
			Button btAdicionar = new Button("Adicionar");
			raiz.getChildren().addAll(lbNome,tfNome,telefone,tfTelefone,lbEmail,tfEmail,btAdicionar);
			
			btAdicionar.setOnAction(e->{
				conts.add(new Contato(tfNome.getText(),tfEmail.getText(),Integer.parseInt(tfTelefone.getText())));
				atualizarTabela();
				});
			Scene cena = new Scene(raiz);
			this.setScene(cena);
			this.show();
		}
		
	}
	
	//Componente personalizado para exibir dados de contato
	public class ContatoSelectionViewer extends VBox{
		
		Label email;
		Label telefone;
		
		public ContatoSelectionViewer(){
			this.setSpacing(5);
			Label cabecalho = new Label("Contato Selecionado:");
			cabecalho.setFont(new Font("Segoe UI",14));
			email = new Label();
			telefone = new Label();
			this.getChildren().addAll(cabecalho,email,telefone);
		}
		
		//Método que define os dados a serem exibidos quando se clicar em 
		//um contato da lista.
		public void setContato(Contato contato){
			email.setText("E-mail: "+contato.getEmail());
			telefone.setText("Telefone: "+contato.getTelefone().toString());
		}
		
		
	}
	
	public class JanelaRemoverContato extends Stage{
		
		public JanelaRemoverContato(){
			VBox raiz = new VBox();
			ListView lvContatos = new ListView(conts);
			Button btRemover = new Button("Remover");
			ContatoSelectionViewer viewer = new ContatoSelectionViewer();
			lvContatos.setOnMouseClicked(e->viewer.setContato(conts.get(lvContatos.getSelectionModel().getSelectedIndex())));
			lvContatos.setOnKeyPressed(e->viewer.setContato(conts.get(conts.indexOf(lvContatos.getSelectionModel().getSelectedItem()))));
			btRemover.setOnAction(e->{
				conts.remove(conts.get(conts.indexOf(lvContatos.getSelectionModel().getSelectedItem())));
				atualizarTabela();
			});
			raiz.getChildren().addAll(lvContatos,btRemover,viewer);
			Scene cena = new Scene(raiz);
			this.setScene(cena);
			this.show();
			
		}
		
	}

}
