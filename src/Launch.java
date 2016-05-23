import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Launch extends Application {
	@Override
    public void start(Stage stage) throws IOException {
    	
		Parent root = FXMLLoader.load(getClass().getResource("Quiz11.fxml"));
	    
        Scene scene = new Scene(root, 445, 161);
    
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}