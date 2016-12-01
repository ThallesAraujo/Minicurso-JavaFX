package aula6;
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

public class ExemploLineChart extends Application{

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox raiz = new VBox(10);
		raiz.setPadding(new Insets(10,10,10,10));
		Label label = new Label("Consumo de memória RAM por navegador");
		label.setFont(new Font("Trebuchet MS",16));
		raiz.getChildren().add(label);
		
		CategoryAxis eixoX = new CategoryAxis();
		eixoX.setLabel("Quant. de abas abertas");
		
		NumberAxis eixoY = new NumberAxis();
		eixoY.setLabel("RAM (em k)");
		
		LineChart chart = new LineChart<>(eixoX,eixoY);
		
		XYChart.Series chrome = new XYChart.Series<>();
		chrome.setName("Chrome 34");
		chrome.getData().add(new XYChart.Data<>("5",258589));
		chrome.getData().add(new XYChart.Data<>("15",448015 ));
		chrome.getData().add(new XYChart.Data<>("40",1167298));
		
		XYChart.Series firefox = new XYChart.Series<>();
		firefox.setName("Firefox 29");
		firefox.getData().add(new XYChart.Data<>("5",225552));
		firefox.getData().add(new XYChart.Data<>("15",327060));
		firefox.getData().add(new XYChart.Data<>("40",779100 ));
		
		XYChart.Series ie = new XYChart.Series<>();
		ie.setName("IE 11");
		ie.getData().add(new XYChart.Data<>("5",221989));
		ie.getData().add(new XYChart.Data<>("15",550869));
		ie.getData().add(new XYChart.Data<>("40",1547254));
		
		chart.getData().addAll(chrome,firefox,ie);
		raiz.getChildren().add(chart);
		
		Label info = new Label("*teste realizado em 2 de janeiro de 2014 pelo ghacks.net\n"
				+ "(http://www.ghacks.net/2014/01/02/chrome-34-firefox-29-internet-explorer-11-memory-use-2014/)");
		info.setFont(new Font("Trebuchet MS Italic",10));
		raiz.getChildren().add(info);
		
		Scene cena = new Scene(raiz);
		palco.setScene(cena);
		palco.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
