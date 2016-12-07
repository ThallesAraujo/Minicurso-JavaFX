package aula7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GraficosTurmasLinha extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox raiz = new VBox(10);
		raiz.setPadding(new Insets(10,10,10,10));
		Label label = new Label("Médias das Turmas");
		label.setFont(new Font("System",16));
		raiz.getChildren().add(label);
		
		CategoryAxis eixoX = new CategoryAxis();
		eixoX.setLabel("Bimestre");
		
		NumberAxis eixoY = new NumberAxis();
		eixoY.setLabel("Notas");
		
		LineChart chart = new LineChart<>(eixoX,eixoY);
		
		XYChart.Series t300 = new XYChart.Series<>();
		t300.setName("Turma T300");
		t300.getData().add(new XYChart.Data<>("1º",6.8));
		t300.getData().add(new XYChart.Data<>("2º",7));
		t300.getData().add(new XYChart.Data<>("3º",6.1));
		t300.getData().add(new XYChart.Data<>("4º",7.4));
		
		XYChart.Series t301 = new XYChart.Series<>();
		t301.setName("Turma T301");
		t301.getData().add(new XYChart.Data<>("1º",5.9));
		t301.getData().add(new XYChart.Data<>("2º",7.6));
		t301.getData().add(new XYChart.Data<>("3º",8.3));
		t301.getData().add(new XYChart.Data<>("4º",9.2));
		
		XYChart.Series t302 = new XYChart.Series<>();
		t302.setName("Turma t302");
		t302.getData().add(new XYChart.Data<>("1º",5.7));
		t302.getData().add(new XYChart.Data<>("2º",6.1));
		t302.getData().add(new XYChart.Data<>("3º",7.4));
		t302.getData().add(new XYChart.Data<>("4º",9));
		
		chart.getData().addAll(t300,t301,t302);
		raiz.getChildren().add(chart);
		
		Scene cena = new Scene(raiz);
		palco.setScene(cena);
		palco.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
