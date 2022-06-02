package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import model.City;
import model.Controller;

public class FloydWindowController implements Initializable {
	
	private Controller controller;

	private Main main;

	private String[] citys = { "Danville", "Buenos Aires", "Berlín", "Bruselas", "Brasília", "La Habana", "Quito",
			"Bogotá", "Moscú", "Varsovia", "Lisboa", "Londres", "Bucarest", "Belgrado", "Manila", "París", "Bangkok",
			"Ankara", "Pekín", "Santiago de Chile", "Panamá", "Lima", "Asunción", "Tokio", "Ámsterdam", "Doha", "Praia",
			"Ottawa", "Viena", "Kuala Lumpur", "Ciudad de México", "Roma", "Washington D.C","Helsinki", "Estocolmo", "Berna",
			"Ciudad de Guatemala", "Atenas", "Puerto Principe", "Kiev", "Nueva Delhi", "Yakarta", "Nairobi", "San José",
			"Séul", "Oslo", "Madrid", "Budapest", "Wellington", "Caracas" };

	public Main getMain() {
		return main;
	}

	

	@FXML
	private Button searchBTT;

	@FXML
	private ImageView imageStart;

	@FXML
	private ImageView imageEnd;

	@FXML
	private Text mensajeTX;

	@FXML
	private ComboBox<String> cityStartCB;

	@FXML
	private ComboBox<String> cityEndCB;

	@FXML
	private TextArea textAreaFloyd;



	@FXML
	void searchCM(ActionEvent event) {
		String cbStart = cityStartCB.getValue();
		String cbEnd = cityEndCB.getValue();
		String nullE = null;
		try {

			if (cbStart.equals(cbEnd) || cbEnd.equals(cbStart)) {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("(WARNING)Start and destination city are the same");
				alert.setHeaderText("You must select different cities");
				alert.showAndWait();
				if (cbStart.equals(nullE)) {
					Alert alert2 = new Alert(AlertType.WARNING);
					alert2.setTitle("No starting city");
					alert2.setHeaderText("First you must select a starting city ");
					alert2.showAndWait();

				} else if (cbEnd.equals(nullE)) {
					Alert alert2 = new Alert(AlertType.WARNING);
					alert2.setTitle("No destination city");
					alert2.setHeaderText("First you must select a destination city");
					alert2.showAndWait();
				}

			} else {
				// Algoritmo Floyd
				City cityA= controller.returnCityFInitial();
				
				City cityB = controller.returnCityFEnd();
				
				
				System.out.println("Funciona");
				mensajeTX.setText("The shortest way from "+cbStart+" to reach "+cbEnd+ " is");
				textAreaFloyd.setVisible(true);
			}
		} catch (NullPointerException e) {

			Alert alert1 = new Alert(AlertType.WARNING);
			alert1.setTitle("(WARNING)No start or destination city");
			alert1.setHeaderText("First you must select a starting city and a destination city.");
			alert1.showAndWait();

		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Start
		cityStartCB.getItems().addAll(citys);
	
		// End
		cityEndCB.getItems().addAll(citys);
		
		
		textAreaFloyd.setVisible(false);

		mensajeTX.setText("");
		;

	}
	
	public ComboBox<String> getCityStartCB() {
		return cityStartCB;
	}

	public void setCityStartCB(ComboBox<String> cityStartCB) {
		this.cityStartCB = cityStartCB;
	}

	public ComboBox<String> getCityEndCB() {
		return cityEndCB;
	}

	public void setCityEndCB(ComboBox<String> cityEndCB) {
		this.cityEndCB = cityEndCB;
	}

	public void setMain(Main main) {
		this.main = main;
	}

}
