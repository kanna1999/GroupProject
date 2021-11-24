package teamProject.JavaFx;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
	
	static boolean answer;
	
	public static boolean display(String title, String message) {
		
		Stage window = new Stage();
		Font font = Font.font("Courier New", FontWeight.BOLD, 36);
		
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		
		
		Label label = new Label();
		label.setText(message);
		Button closeButton = new Button("Close Window");
		closeButton.setOnAction(e-> window.close());
		closeButton.setFont(font);
		

		//create two buttons
		Button yesButton = new Button("Yes");
		Button noButton = new Button("No");
		yesButton.setFont(font);
		noButton.setFont(font);
		
		
		yesButton.setOnAction(e-> {
			answer = true;
			window.close();
			
		});
		
		
		noButton.setOnAction(e-> {
			answer = false;
			window.close();
			
		});
		
		
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, closeButton);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
		
		return answer;
		
	}

}
