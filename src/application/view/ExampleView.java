package application.view;

import java.io.IOException;

import application.control.ExampleControl;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ExampleView {
	
	private static Stage stage;
	private static Scene scene;
	private static Parent root;
	
	public static void buildScreen(Stage primaryStage) {
		FXMLLoader rootFxml = new FXMLLoader();
		rootFxml.setLocation(ExampleView.class.getResource("ExampleView.fxml"));
		rootFxml.setController(new ExampleControl());
		
		try {
			root = rootFxml.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		scene = new Scene(root);
		
		stage = primaryStage;
		stage.setTitle("");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
}
