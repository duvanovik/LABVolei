package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Tab1Controller {
	
    @FXML
    private Button buttCambiar;

    @FXML
    void cambiarPagina(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Tab2.fxml"));
    	buttCambiar.getScene().setRoot(root);
    }
	
}
