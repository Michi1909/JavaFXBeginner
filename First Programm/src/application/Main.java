package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		root.setTop(new Button("Top"));
		root.setBottom(new Button("Bottom"));
		root.setLeft(new Button("Left"));
		root.setRight(new Button("Right"));
		root.setCenter(new Button("Center"));
		Scene scene = new Scene(root,600,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
