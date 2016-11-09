package aula1;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemploFormulario extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane raiz = new Pane();
		Label rotulo = new Label("Nome:");
		TextField tfNome = new TextField();
		Button btNome = new Button("Exibir");
		Label rtCidade = new Label("Cidade:");
		Label rtTelefone = new Label("Telefone:");
		TextField tfCidade = new TextField();
		TextField tfTelefone = new TextField();
		
		
		
		rotulo.setLayoutX(5);
		rotulo.setLayoutY(2);
		
		tfNome.setLayoutX(5);
		tfNome.setLayoutY(30);
		
		rtCidade.setLayoutX(5);
		rtCidade.setLayoutY(70);
		
		tfCidade.setLayoutX(5);
		tfCidade.setLayoutY(100);
		
		rtTelefone.setLayoutX(5);
		rtTelefone.setLayoutY(140);
		
		tfTelefone.setLayoutX(5);
		tfTelefone.setLayoutY(170);
		
		btNome.setLayoutX(5);
		btNome.setLayoutY(200);
		
//		btNome.setOnAction(new EventHandler(){
//
//			@Override
//			public void handle(Event arg0) {
//				JanelaExibir janela = new JanelaExibir();
//				janela.setNome(tfNome.getText());
//				janela.exibir();
//			}
//			
//		});
		
		btNome.setOnAction(t ->{
			JanelaExibir janela = new JanelaExibir();
			janela.setNome(tfNome.getText());
			janela.setCidade(tfCidade.getText());
			janela.setTelefone(tfTelefone.getText());
			janela.exibir();
		});
		
		raiz.getChildren().addAll(rotulo,tfNome,btNome,rtCidade,tfCidade,rtTelefone,tfTelefone);
		
		Scene cena = new Scene(raiz,200,200);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	public class JanelaExibir extends Stage{
		
		private Label nome;
		private Label cidade;
		private Label telefone;
		private Pane raiz;
		private Scene cena;
		
		public JanelaExibir(){
			raiz = new Pane();
			nome = new Label();
			nome.setLayoutY(10);
			telefone = new Label();
			telefone.setLayoutY(30);
			cidade = new Label();
			cidade.setLayoutY(60);
			raiz.getChildren().addAll(nome,cidade,telefone);
			cena = new Scene(raiz,300,300);
			this.setScene(cena);
		}
		
		public void setNome(String nome){
			this.nome.setText("Nome digitado: "+nome);
		}
		
		public void setTelefone(String telefone){
			this.telefone.setText("Telefone digitado: "+telefone);
		};
		
		public void setCidade(String cidade){
			this.cidade.setText("Cidade digitada: "+cidade);
		};
		
		public void exibir(){
			this.show();
		}
		
	}

}
