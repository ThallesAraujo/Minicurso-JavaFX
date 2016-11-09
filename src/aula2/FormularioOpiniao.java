package aula2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FormularioOpiniao extends Application {

	@Override
	public void start(Stage palco) throws Exception {
		
		Pane raiz = new Pane();
		
		Label lbNome = new Label("Nome:");
		TextField tfNome = new TextField();
		
		Label lbIde = new Label("Qual IDE você utiliza?");
		
		ToggleGroup grupoIde = new ToggleGroup();
		RadioButton rbEclipse = new RadioButton("Eclipse");
		RadioButton rbInteliJ = new RadioButton("InteliJ IDEA");
		RadioButton rbNetbeans = new RadioButton("NetBeans");
		
		grupoIde.getToggles().addAll(rbEclipse,rbInteliJ,rbNetbeans);
		
		Label lbLinguagem = new Label("Quais linguagens de programação você "
				+ "utiliza?");
		CheckBox cbJava = new CheckBox("Java");
		CheckBox cbPython = new CheckBox("Python");
		CheckBox cbC = new CheckBox("C");
		CheckBox cbRuby = new CheckBox("Ruby");
		
		Button btExibir = new Button("Exibir resultado");
		
		lbNome .setLayoutY(5);
		tfNome.setLayoutX(100);
		tfNome.setLayoutY(5);
		
		lbIde.setLayoutY(30);
		rbEclipse.setLayoutY(45);
		rbInteliJ.setLayoutY(80);
		rbNetbeans.setLayoutY(120);
		
		lbLinguagem.setLayoutY(160);
		cbJava.setLayoutY(200);
		cbPython.setLayoutY(220);
		cbC.setLayoutY(250);
		cbRuby.setLayoutY(300);
		
		btExibir.setLayoutY(350);
	
		
		btExibir.setOnAction( e->{
			Stage exibeResultado = new Stage();
			Pane painelResultado = new Pane();
			Label lbNomeDigitado = new Label();
			Label lbIdes = new Label();
			Label lbLinguagens = new Label();
			lbNomeDigitado.setLayoutY(5);
			lbIdes.setLayoutY(20);
			lbLinguagens.setLayoutY(40);
			painelResultado.getChildren().addAll(lbNomeDigitado,lbIdes,lbLinguagens);
			Scene resultado = new Scene(painelResultado,400,400);
			exibeResultado.setScene(resultado);
			lbNomeDigitado.setText("Nome: "+tfNome.getText());
			String linguagens = new String();
			if(cbJava.isSelected()){
				linguagens = linguagens+", "+cbJava.getText();
			}
			if(cbPython.isSelected()){
				linguagens = linguagens+", "+cbPython.getText();
			}
			if(cbC.isSelected()){
				linguagens = linguagens+", "+cbC.getText();
			}
			if(cbRuby.isSelected()){
				linguagens = linguagens+", "+cbRuby.getText();
			}
			
			lbLinguagens.setText("Linguagens: "+linguagens);
			lbIdes.setText("IDE's: "+grupoIde.getSelectedToggle().toString());
			exibeResultado.show();
		});
		
		Scene cena = new Scene(raiz,500,500);
		raiz.getChildren().addAll(lbNome,tfNome,lbIde,rbEclipse,rbInteliJ,
				rbNetbeans,lbLinguagem,cbJava,cbPython,cbC,cbRuby,btExibir);
		palco.setScene(cena);
		palco.show();
		
		
		
	}
	

	public static void main(String[] args) {
		launch();
	}
	
}
