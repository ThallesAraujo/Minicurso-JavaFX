package aula6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GraficoComplementarColuna extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox raiz = new VBox(10);
		raiz.setPadding(new Insets(10,10,10,10));
		Label titulo = new Label("Média Geral");
		titulo.setFont(new Font("System",16));
		raiz.getChildren().add(titulo);
		
		NumberAxis eixoY = new NumberAxis();
		eixoY.setLabel("Notas");
		
		CategoryAxis eixoX = new CategoryAxis();
		eixoX.setLabel("Bimestre");
		
		BarChart chart = new BarChart(eixoX,eixoY);
		
		double media1 = (6.8+5.9+5.7)/3;
		double media2 = (7+7.6+6.1)/3;
		double media3 = (6.1+8.3+7.4)/3;
		double media4 = (7.4+9.2+9)/3;
		
		XYChart.Series media = new XYChart.Series<>();
		media.setName("Média das turmas");
		media.getData().add(new XYChart.Data<>("1º",media1));
		media.getData().add(new XYChart.Data<>("2º",media2));
		media.getData().add(new XYChart.Data<>("3º",media3));
		media.getData().add(new XYChart.Data<>("4º",media4));
		
		chart.getData().addAll(media);
		raiz.getChildren().add(chart);
		
		Scene cena = new Scene(raiz);
		palco.setScene(cena);
		palco.show();
		
		
	}

	public static void main(String[] args) {
		launch();
	}
}
