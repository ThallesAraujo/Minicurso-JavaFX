package aula6;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ExemploPieChart extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox raiz = new VBox(10);
		raiz.setPadding(new Insets(10,10,10,10));
		Label label = new Label("Fragmentação do Android (%)");
		label.setFont(new Font("System Bold",16));
		raiz.getChildren().add(label);
		
		PieChart chart = new PieChart();
		chart.getData().addAll(new PieChart.Data("6.0 Marshmallow",18.7),
				new PieChart.Data("5.0 - 5.1 Lollipop", 35),
				new PieChart.Data("4.4 KitKat", 27.7),
				new PieChart.Data("4.1 - 4.3 JellyBean", 15.6),
				new PieChart.Data("4.0 Ice Cream Sandwich", 1.4),
				new PieChart.Data("2.3 Gingerbread", 1.5),
				new PieChart.Data("2.2 FroYo", 0.1));
		raiz.getChildren().add(chart);
		Label labelInfo = new Label("*dados coletados no dia 5 de setembro de 2016.\n"
				+ "Fonte: Android Dashboards (https://developer.android.com/about/dashboards/index.html)");
		labelInfo.setFont(new Font("System Italic",10));
		raiz.getChildren().add(labelInfo);
		Scene cena = new Scene(raiz);
		palco.setScene(cena);
		palco.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	

}
