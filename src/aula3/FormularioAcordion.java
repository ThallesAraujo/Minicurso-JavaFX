package aula3;

import aula1.ExemploFormulario.JanelaExibir;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FormularioAcordion extends Application{

	public void start(Stage palco) throws Exception {

		Accordion raiz = new Accordion();

		TitledPane tlNome = new TitledPane();
		TitledPane tlCidade = new TitledPane();
		TitledPane tlTelefone = new TitledPane();
		TitledPane tlBotao = new TitledPane();

		tlNome.setText("Nome");
		tlCidade.setText("Cidade");
		tlTelefone.setText("Telefone");
		tlBotao.setText("Finalizar");


		TextField tfNome = new TextField();
		Button btNome = new Button("Exibir");
		TextField tfCidade = new TextField();
		TextField tfTelefone = new TextField();

		tlNome.setContent(tfNome);
		tlCidade.setContent(tfCidade);
		tlTelefone.setContent(tfTelefone);
		tlBotao.setContent(btNome);

		btNome.setOnAction(t ->{
			JanelaExibir janela = new JanelaExibir();
			janela.setNome(tfNome.getText());
			janela.setCidade(tfCidade.getText());
			janela.setTelefone(tfTelefone.getText());
			janela.exibir();
		});

		raiz.getPanes().addAll(tlNome,tlCidade,tlTelefone,tlBotao);
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

