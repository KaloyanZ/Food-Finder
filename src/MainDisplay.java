import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainDisplay extends Application {
	@Override
    public void start(Stage primaryStage) throws Exception 
  {
        Parent root = FXMLLoader.load(getClass().getResource("Screens/Main.fxml"));
        
        primaryStage.setTitle("Food Finder!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) throws IOException {
    	launch(args);
    	
    }
}
