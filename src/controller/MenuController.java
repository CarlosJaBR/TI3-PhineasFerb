package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuController {
	private Main main;

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}
	
	
	@FXML
    private MenuBar MenuBar;

    @FXML
    private Menu BTTHome;

    @FXML
    private Menu BTTWeightPaths;

    @FXML
    private MenuItem Floyd;

    @FXML
    private MenuItem BTTDijkstra;

    @FXML
    void DijkstraWindow(ActionEvent event) {
    	try {
			main.Dijkstra();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void FloydWarshallWindow(ActionEvent event) {
    	try {
			main.Floyd();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void HomeWindow(ActionEvent event) {
    	main.initialView();
    }

    @FXML
    void WeightPaths(ActionEvent event) {

    }
}
