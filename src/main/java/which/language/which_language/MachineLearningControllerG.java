package which.language.which_language;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MachineLearningControllerG implements Initializable {

    @FXML
    private Button PythonButton;

    @FXML
    private void Python() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Python.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) PythonButton.getScene().getWindow();

        stage.setTitle("Python");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
