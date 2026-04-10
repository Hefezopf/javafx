package de.hopfit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

	@FXML
	Button firstBtn;
	
	public void print(ActionEvent e) {
		System.out.println("Button pressed");
	}
}
