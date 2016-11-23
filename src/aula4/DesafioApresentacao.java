package aula4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DesafioApresentacao extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		TabPane painel = new TabPane();
		
		Tab abaInfoBasicas = new Tab("Infs. B�sicas");
		Tab abaInfoAcademicas = new Tab("Infs. Acad�micas");
		
		VBox vbInfoBasicas = new VBox(10);
		VBox vbInfoAcademicas = new VBox(10);
		
		vbInfoBasicas.getChildren().addAll
		(new Label("\nNome: Thalles Henrique do Nascimento Ara�jo"),
		new Label("Nascimento: 18 de agosto de 1995 (21 Anos)"),
		new Label("Resid�ncia: Sert�nia -PE"),
		new Label("Naturalidade: Gama - DF"));
		
		vbInfoAcademicas.getChildren().addAll(
		new Label("\n2011 - Centro Educacional 08 do Gama\nEnsino M�dio, 1� Ano (Gama - DF)"),
		new Label("2012 / 2013 - Escola Professor Jorge de Menezes\nEnsino M�dio, 2� e 3� Ano, (Sert�nia - PE)"),
		new Label("2014 / Atualmente - IFPB Campus Monteiro\nEnsino Superior - ADS (Monteiro - PB)"));
		
		abaInfoBasicas.setContent(vbInfoBasicas);
		abaInfoAcademicas.setContent(vbInfoAcademicas);
		
		painel.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		painel.getTabs().addAll(abaInfoBasicas,abaInfoAcademicas);
		
		Scene cena = new Scene(painel,300,300);
		palco.setScene(cena);
		palco.show();
										   
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	

}
