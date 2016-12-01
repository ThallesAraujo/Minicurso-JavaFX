package aula5;
import java.awt.GraphicsEnvironment;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Teste{

	public static void main(String[] args) {
		
		//Retornar todas as fontes instaladas
		
		String[] fontes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(String s: fontes){
			System.out.println(s);
		}
		
	}

}
