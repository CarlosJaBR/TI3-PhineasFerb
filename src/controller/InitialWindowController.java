package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import model.Controller;

public class InitialWindowController implements Initializable{

	private Main main;
	
	private Controller controller;
	
	private String[] algorithm= {"Floyd", "Dijkstra"};

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}
	
	 @FXML
	    private Button bttStart;

	    @FXML
	    private ComboBox<String> comboBoxAlg;

	    @FXML
	    void selectAlgorithm(ActionEvent event) {
	    //	chooseAlgorithm();
	    }

	    @FXML
	    void startProgram(ActionEvent event) {
	    	String algorithm = comboBoxAlg.getValue();
	    	String f="Floyd";
	    	String d="Dijkstra";
	    	if(algorithm.equals("Floyd")) {
	    		try {
					main.Floyd();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}else if(algorithm.equals("Dijkstra")) {
	    		try {
					main.Dijkstra();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    }
	    /*
	    public String chooseAlgorithm() {
	    	String algorithm = comboBoxAlg.getValue();
	    	String f="Floyd";
	    	String d="Dijkstra";
			if (algorithm.equals(f)) {
				return f;
			} else if (algorithm.equals(d)) {
				return d;
				
			}
			return null;
			
	    }*/

		@Override
		public void initialize(URL location, ResourceBundle resources) {
	
		comboBoxAlg.getItems().addAll(algorithm);
		comboBoxAlg.setOnAction(this::selectAlgorithm);
		}

		
}
