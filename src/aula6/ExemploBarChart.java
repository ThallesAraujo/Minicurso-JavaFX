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

public class ExemploBarChart extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox raiz = new VBox(10);
		raiz.setPadding(new Insets(10,10,10,10));
		Label titulo = new Label("Plataformas móveis - Marketshare");
		titulo.setFont(new Font("System Bold",16));
		raiz.getChildren().add(titulo);
		
		NumberAxis eixoY = new NumberAxis();
		eixoY.setLabel("Vendas (%)");
		
		CategoryAxis eixoX = new CategoryAxis();
		eixoX.setLabel("Anos (Segundo Semestre)");
		
		BarChart chart = new BarChart(eixoX,eixoY);
		
		XYChart.Series android = new XYChart.Series<>();
		android.setName("Android");
		android.getData().add(new XYChart.Data<>("2013",79.8));
		android.getData().add(new XYChart.Data<>("2014",84.8));
		android.getData().add(new XYChart.Data<>("2015",82.8));
		
		XYChart.Series ios = new XYChart.Series<>();
		ios.setName("iOS");
		ios.getData().add(new XYChart.Data<>("2013",12.9));
		ios.getData().add(new XYChart.Data<>("2014",11.6));
		ios.getData().add(new XYChart.Data<>("2015",13.9));
		
		XYChart.Series wp = new XYChart.Series<>();
		wp.setName("Windows Phone");
		wp.getData().add(new XYChart.Data<>("2013",3.4));
		wp.getData().add(new XYChart.Data<>("2014",2.5));
		wp.getData().add(new XYChart.Data<>("2015",2.6));
		
		chart.getData().addAll(android,ios,wp);
		raiz.getChildren().add(chart);
		
		Label label = new Label("*dados coletados pelo IDC.\n"
				+ "Disponível em http://www.idc.com/prodserv/smartphone-os-market-share.jsp");
		label.setFont(new Font("System Italic",10));
		
		raiz.getChildren().add(label);
		
		Scene cena = new Scene(raiz);
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	

}
