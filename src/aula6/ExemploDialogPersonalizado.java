package aula6;
import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploDialogPersonalizado extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		Dialog dl = new Dialog();
		dl.setTitle("Diálogo customizado");
		VBox raiz = new VBox(10);
		
		HBox conteinerLogin = new HBox(10);
		Label lbLogin = new Label("Login:");
		TextField tfLogin = new TextField();
		conteinerLogin.getChildren().addAll(lbLogin,tfLogin);
		
		HBox conteinerSenha = new HBox(10);
		Label lbSenha = new Label("Senha:");
		TextField tfSenha = new TextField();
		conteinerSenha.getChildren().addAll(lbSenha,tfSenha);
		dl.setHeaderText("Login:");
		raiz.getChildren().addAll(conteinerLogin,conteinerSenha);
		
		dl.getDialogPane().setContent(raiz);
		dl.getDialogPane().getButtonTypes().addAll(ButtonType.OK,ButtonType.CANCEL);
		Optional resposta = dl.showAndWait();
		System.out.println(resposta);
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
