package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class SampleController implements Initializable {
	
	@FXML
	private Label label1;
	
	@FXML
	private void handleButtonAction (ActionEvent event) {
		
	System.out.println("1");
		label1.setText("Number One");	
	}
	@FXML
	private Label label2;
	
	@FXML
	private void handleButtonAction1 (ActionEvent event) {
		
	System.out.println("2");
		label2.setText("Number Two");	
	}
	@FXML
	private Label label3;
	
	@FXML
	private void handleButtonAction2 (ActionEvent event) {
		
	System.out.println("3");
		label3.setText("Number Three");	
	}
	@FXML
	private Label label4;
	
	@FXML
	private void handleButtonAction3 (ActionEvent event) {
		
	System.out.println("4");
		label4.setText("Number Four");	
	}
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
		
}
