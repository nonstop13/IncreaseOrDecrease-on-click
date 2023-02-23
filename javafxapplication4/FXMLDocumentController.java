/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author MSI
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button Increase;
    @FXML
    private Button decrease;
    
     int num = 0;
    
    private void handleButtonAction(ActionEvent event) {
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
        label.setText(num+"");
    }    

    @FXML
    private void IncreaseHandleButton(ActionEvent event) {
        num++;
        label.setText(num+"");
    }

    @FXML
    private void DecreaseButtonAction(ActionEvent event) {
        num--;
        label.setText(num+"");
    }
    
}
