/**
 * Sample Skeleton for 'LunghezzaParola.fxml' Controller Class
 */

package it.polito.tdp.lunghezza;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LunghezzaParolaController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="btnLunghezza"
    private Button btnLunghezza; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML
    void doLunghezza(ActionEvent event) {

    	String parola = txtParola.getText();
    	int lunghezza = parola.length();
    	txtResult.appendText("La lunghezza di " +parola+ " e' di " +lunghezza+ " caratteri.\n");
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'LunghezzaParola.fxml'.";
        assert btnLunghezza != null : "fx:id=\"btnLunghezza\" was not injected: check your FXML file 'LunghezzaParola.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'LunghezzaParola.fxml'.";

    }
}
