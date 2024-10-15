
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Controller {
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField ageTextField;
    @FXML
    private TextField emailidTextField;

    public void submit(ActionEvent event) {
        System.out.println("Submitted");

        String name = nameTextField.getText();
        String ageText = ageTextField.getText();
        String email = emailidTextField.getText();

        int age;
        try {
            age = Integer.parseInt(ageText);
            
            
            if (age < 0 || age > 120) {
                showAlert(AlertType.ERROR, "Invalid Age", "AGE no More Than 120.");
                return; 
            }
            
        } catch (NumberFormatException e) {
            showAlert(AlertType.ERROR, "Enter the Details Please", "Your Form is Blank...");
            return; 
        }

        
        if (!isValidEmail(email)) {
            showAlert(AlertType.ERROR, "Invalid Email", "enter your email ID.");
            return; 
        }
        if (name.equals("")) {
            showAlert(AlertType.ERROR, "Invalid Name", " enter your Name.");
            return; 
        }

        
        String displayMessage = "Name: " + name + ", Age: " + age + ", Email: " + email;
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Submitted");
        alert.setHeaderText("Thank You");
        alert.setContentText("Submitted Details: " + displayMessage);
        alert.showAndWait();
    }

    private boolean isValidEmail(String email) {
        
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(emailRegex);
    }

    private void showAlert(AlertType alertType, String header, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(header);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
