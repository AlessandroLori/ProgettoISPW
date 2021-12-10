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

public class WebDevelopmentControllerG implements Initializable{
    @FXML
    private Button HTMLButton;
    @FXML
    private Button CSSButton;
    @FXML
    private Button PHPButton;
    @FXML
    private Button JavaScryptButton;
    @FXML
    private Button JavaButton;

    @FXML
    private void HTML() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HTML.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) HTMLButton.getScene().getWindow();

        stage.setTitle("HTML");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void CSS() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CSS.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) CSSButton.getScene().getWindow();

        stage.setTitle("CSS");
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
    private void JavaScrypt() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("JavaScript.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) JavaScryptButton.getScene().getWindow();

        stage.setTitle("JavaScrypt");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void Java() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Java.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) JavaButton.getScene().getWindow();

        stage.setTitle("Java");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
