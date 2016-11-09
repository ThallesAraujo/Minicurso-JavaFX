package aula2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EditorDeTextos extends Application{

	@Override
	public void start(Stage palco) throws Exception {
	
		TextField titulo = new TextField();
		
		TextArea conteudo = new TextArea();
		
		titulo.setLayoutY(5);
		conteudo.setLayoutY(50);
		
		Button btSalvar = new Button("Salvar");
		
		btSalvar.setLayoutY(400);
		
		btSalvar.setOnAction( e->{
			
			try {
				PrintWriter print = new PrintWriter(new File("T:\\arquivo.txt"));
				print.print(titulo.getText());
				print.println();
				print.println();
				print.print(conteudo.getText());
				print.flush();
				print.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			
		});
		
		Pane raiz = new Pane();
		raiz.getChildren().addAll(titulo,conteudo,btSalvar);
		Scene cena = new Scene(raiz,500,500);
		//definir título de janela
		palco.setTitle("Título da janela");
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
