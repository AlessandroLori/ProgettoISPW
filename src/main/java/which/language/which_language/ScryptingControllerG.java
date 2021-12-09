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

public class ScryptingControllerG implements Initializable{

    @FXML
    private Button PythonButton;
    @FXML
    private Button RubyButton;
    @FXML
    private Button JavaScryptButton;
    @FXML
    private Button PHPButton;
    @FXML
    private Button RButton;

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

    @FXML
    private void Ruby() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Ruby.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) RubyButton.getScene().getWindow();

        stage.setTitle("Ruby");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void JavaScrypt() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("JavaScrypt.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) JavaScryptButton.getScene().getWindow();

        stage.setTitle("JavaScrypt");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void PHP() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("PHP.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) PHPButton.getScene().getWindow();

        stage.setTitle("PHP");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void R() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("R.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) RubyButton.getScene().getWindow();

        stage.setTitle("R");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
