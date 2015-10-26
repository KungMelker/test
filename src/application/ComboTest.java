package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ComboTest extends Application {

	@Override
	public void start(Stage primaryStage) {
	
		FlowPane root = new FlowPane();
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
		ComboBox <String>cb;
		Label label = new Label("Nothing selected!");
		ObservableList <String> entries=FXCollections.observableArrayList("JavaFX","HTML5","JavaScript","SELECT");
		cb=new ComboBox<String>(entries);
		
		cb.setValue("JavaFX");
		root.getChildren().addAll(label,cb);
		
		cb.setOnAction(event->{
		
			
			label.setText(cb.getValue());
			
		});
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
