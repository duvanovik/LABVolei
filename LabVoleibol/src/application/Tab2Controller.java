package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

public class Tab2Controller {
    @FXML
    private Button buttPrevio;

    @FXML
    public void cambiarPagina(ActionEvent event) {
    	try {
        	Parent root = FXMLLoader.load(getClass().getResource("Tab1.fxml"));
        	buttPrevio.getScene().setRoot(root);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }	

}
