package application;
	
import application.view.ExampleView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		ExampleView.buildScreen(primaryStage);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
