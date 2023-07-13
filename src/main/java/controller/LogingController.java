package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LogingController {

    @FXML
    private TextField txtname;
    static String username;

    @FXML
    void NameOnAction(ActionEvent event) throws IOException {
        username=txtname.getText();
        txtname.clear();
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(LogingController.class.getResource("/viwe/ClientForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();
    }
}
