package teamProject.JavaFx;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Website extends Application implements EventHandler<ActionEvent>{

	Button button, button2;
	Stage window;
	Scene Scene, scene1, scene2;
	Font font = Font.font("Times New Roman", FontWeight.BLACK, 12);

	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle(" BookTickets ");
		
		//Login Button
		button = new Button("Login");
		button.setFont(font);
		button.setOnAction(this);
		
		
		//Register button
		button2 = new Button("Register");
		button2.setFont(font);
		button2.setOnAction(this);
	
		
		//Create GridPane
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(8);
		grid.setHgap(10);
		
	//Username label
		Label username = new Label("Username");
		GridPane.setConstraints(username, 0, 0);
		username.setFont(font);
		
		
	//Username Input
		TextField userName = new TextField();
		GridPane.setConstraints(userName, 1, 0);
		userName.setFont(font);
		userName.setPromptText("Username");
		
		
		
		//Password label
		Label pass = new Label("Password");
		GridPane.setConstraints(pass, 0, 1);
		pass.setFont(font);
		
		//Password input
		TextField passInput = new TextField();
		passInput.setPromptText("Password");
		passInput.setFont(font);
		GridPane.setConstraints(passInput, 1, 1);
		
		
		
		GridPane.setConstraints(button, 1, 2);
		GridPane.setConstraints(button2, 2,2);
		
		grid.getChildren().addAll(username, userName, pass, passInput, button, button2);
		
		//Set first Scene
		scene1 = new Scene(grid, 400, 300);
		
		
		//Show first Scene
		window.setScene(scene1);
		window.show();
		
	
	
		
		
	}	
	
	
	
	
	
	
	
	
	

	
	//Method to check if age is numbers only.
	private boolean isInt(TextField input, String message) {
		
		try {
			
			int age = Integer.parseInt(input.getText());
			System.out.println("User is: " + age);
			return true;
		}catch(NumberFormatException e) {
			System.out.println("Error. " + message + " is not a number");
			return false;
		}
		
		
	}


	
	
	
	
	
	
	@Override
	public void handle(ActionEvent Register) {
		
		Stage REGISTER = new Stage();
		
		
		if(Register.getSource() == button2) {
			
		
		
		GridPane rMenu = new GridPane();
		rMenu.setPadding(new Insets(10,10,10,10));
		rMenu.setVgap(8);
		rMenu.setHgap(10);
		
		
		
		//Firstname Label
		Label firstname = new Label("First Name");
		firstname.setFont(font);
		GridPane.setConstraints(firstname, 2, 1);
		
		//FirstName input
		TextField first = new TextField();
		first.setFont(font);
		GridPane.setConstraints(first, 2, 2);
		
		//LastName label
		Label lastname = new Label("Last Name");
		lastname.setFont(font);
		GridPane.setConstraints(lastname, 2, 3);
		
		//LastName input.
		TextField last = new TextField();
		last.setFont(font);
		GridPane.setConstraints(last, 1, 4);
		
		
		
		//Make window
		rMenu.getChildren().addAll(firstname, first, lastname, last);
		
		scene2 = new Scene(rMenu, 500, 500);
		
		REGISTER.setScene(scene2);
		REGISTER.show();
		
		
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
	

