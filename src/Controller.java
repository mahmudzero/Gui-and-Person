import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller implements Initializable {
	
	TextField[] fields;
	public Controller() {
		fields[0] = inputName;
		fields[1] = inputStreet;
		fields[2] = inputCity;
		fields[3] = inputState;
		fields[4] = inputZip;
	}
	
	@FXML
	private TextField inputName = new TextField();
	@FXML
	private TextField inputStreet = new TextField();
	@FXML
	private TextField inputCity = new TextField();
	@FXML
	private TextField inputState = new TextField();
	@FXML
	private TextField inputZip = new TextField();
	
	
	ArrayList<Person> personList = new ArrayList<Person>();
	int currentIndex;
	
	
	void clearInputs() {
		inputName.clear();
		inputStreet.clear();
		inputCity.clear();
		inputState.clear();
		inputZip.clear();
	}
	
	void addPerson() {
		Person newPerson = new Person(inputName.getText(), inputStreet.getText(), inputCity.getText(), inputState.getText(), inputZip.getText());
		personList.add(newPerson);
		clearInputs();
		currentIndex = 0;
	}
	
	void goToFirst() {
		currentIndex = 0;
		inputName.setText(personList.get(currentIndex).getName());
		inputStreet.setText(personList.get(currentIndex).getStreet());
		inputCity.setText(personList.get(currentIndex).getCity());
		inputState.setText(personList.get(currentIndex).getState());
		inputZip.setText(personList.get(currentIndex).getZip());
	}
	
	void goToLast() {
		currentIndex = personList.size() - 1;
		inputName.setText(personList.get(currentIndex).getName());
		inputStreet.setText(personList.get(currentIndex).getStreet());
		inputCity.setText(personList.get(currentIndex).getCity());
		inputState.setText(personList.get(currentIndex).getState());
		inputZip.setText(personList.get(currentIndex).getZip());
	}
	
	void goToNext() {
		//Makes button go to first person if you are already at last person
		if (currentIndex < personList.size() - 1) {
			currentIndex += 1;
		} else {
			currentIndex = 0;
		}
		inputName.setText(personList.get(currentIndex).getName());
		inputStreet.setText(personList.get(currentIndex).getStreet());
		inputCity.setText(personList.get(currentIndex).getCity());
		inputState.setText(personList.get(currentIndex).getState());
		inputZip.setText(personList.get(currentIndex).getZip());
	}
	
	void goToPrevious() {
		//Makes the button go to the last person if you are already at the first person
		if (currentIndex > 0) {
			currentIndex -= 1;
		} else {
			currentIndex = personList.size() - 1;
		}
		inputName.setText(personList.get(currentIndex).getName());
		inputStreet.setText(personList.get(currentIndex).getStreet());
		inputCity.setText(personList.get(currentIndex).getCity());
		inputState.setText(personList.get(currentIndex).getState());
		inputZip.setText(personList.get(currentIndex).getZip());
	}
	
	void printUserInfoToConsole() {
		//Checks if personList is empty, or if the object at the currentIndex is null
		if (personList.size() == 0 || personList.get(currentIndex) == null) {
			System.out.println("Nothing is in the array yet.");
		} else {
			System.out.println("Name: " + personList.get(currentIndex).getName());
			System.out.println("Street: " + personList.get(currentIndex).getStreet());
			System.out.println("City: " + personList.get(currentIndex).getCity());
			System.out.println("State: " + personList.get(currentIndex).getState());
			System.out.println("Zip: " + personList.get(currentIndex).getZip());
		}
	}
	
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Quiz11.fxml"));
     
         Scene scene = new Scene(root, 300, 275);
     
         stage.setTitle("FXML Welcome");
         stage.setScene(scene);
         stage.show();
     }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
