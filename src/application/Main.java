package application;

import java.io.IOException;
import java.util.Stack;

import controller.DijkstraWindowController;
import controller.FloydWindowController;
import controller.InitialWindowController;
import controller.MenuController;
import generics.Node;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Controller;

public class Main extends Application {

	// Stage
	private Stage currentStage;
	//
	private Controller controller;

	@Override
	public void start(Stage primaryStage) {

		controller = new Controller();
		initialView();
	}

	public static void main(String[] args) {
		launch(args);
	}

	// Abre interfaz initialView
	public void initialView() {
		try {

			if (currentStage != null) {
				currentStage.close();
			}

			
			FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/InitialWindow.fxml"));

			BorderPane root_2 = (BorderPane) loader_2.load();

			InitialWindowController controller2 = loader_2.getController();
			Scene scene = new Scene(root_2, 791, 557);
			Stage stage = new Stage();
			stage.setScene(scene);

			controller2.setMain(this);
			stage.setResizable(false);

			root_2= (BorderPane) stage.getScene().getRoot();
			stage.getIcons().add(new Image("/image/PatioPhineasAndFerb.jpg"));
			stage.setTitle("Lost in the world- Phineas and Ferb");

			Image img = new Image("/image/PatioPhineasAndFerb1.jpg");
			BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
					BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
			Background bGround = new Background(bImg);
			root_2.setBackground(bGround);

			
			stage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void Floyd() throws IOException {
		
		currentStage.close();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/Menu.fxml"));
		BorderPane root;

		root = (BorderPane) loader.load();

		MenuController controller = loader.getController();

		controller.setMain(this);

		Scene scene = new Scene(root, 791, 557);
		Stage stage = new Stage();
		stage.setScene(scene);

		currentStage = stage;
		currentStage.close();

		BorderPane floyd;
		FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/FloydWindow.fxml"));

		BorderPane root_2;

		root_2 = (BorderPane) loader_2.load();

		FloydWindowController controller2 = loader_2.getController();

		controller2.setMain(this);
		currentStage.setResizable(false);

		floyd = (BorderPane) stage.getScene().getRoot();
		currentStage.getIcons().add(new Image("/image/PatioPhineasAndFerb.jpg"));
		currentStage.setTitle("Lost in the world- Floyd");

		Image img = new Image("/image/PatioPhineasAndFerb1.jpg");
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		Background bGround = new Background(bImg);
		root.setBackground(bGround);

		floyd.setCenter(root_2);
		currentStage.setResizable(false);
		//
		stage.show();
		

	}

	public void Dijkstra() throws IOException {
	
		//currentStage.close();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/Menu.fxml"));
		BorderPane root;

		root = (BorderPane) loader.load();

		MenuController controller = loader.getController();

		controller.setMain(this);

		Scene scene = new Scene(root, 791, 557);
		Stage stage = new Stage();
		stage.setScene(scene);

		currentStage = stage;
		currentStage.close();

		BorderPane floyd;
		FXMLLoader loader_2 = new FXMLLoader(getClass().getResource("../ui/DijkstraWindow.fxml"));

		BorderPane root_2;

		root_2 = (BorderPane) loader_2.load();

		DijkstraWindowController controller2 = loader_2.getController();

		controller2.setMain(this);
		currentStage.setResizable(false);

		floyd = (BorderPane) stage.getScene().getRoot();
		currentStage.getIcons().add(new Image("/image/PatioPhineasAndFerb.jpg"));
		currentStage.setTitle("Lost in the world- Dijkstra");

		Image img = new Image("/image/PatioPhineasAndFerb1.jpg");
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		Background bGround = new Background(bImg);
		root.setBackground(bGround);

		floyd.setCenter(root_2);
		currentStage.setResizable(false);
		//
		stage.show();
	}
	
	public Stack<Node<String>> dijkstra(String name1, String name2){
		return controller.dijktraAlgorothm(name1, name2);
	}

}
