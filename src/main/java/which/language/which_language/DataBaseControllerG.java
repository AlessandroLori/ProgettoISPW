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

public class DataBaseControllerG implements Initializable{
    @FXML
    private Button MySQLButton;
    @FXML
    private Button MariaDBButton;
    @FXML
    private Button PHPButton;

    @FXML
    private void MySQL() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MySQL.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) MySQLButton.getScene().getWindow();

        stage.setTitle("MySQL");
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
    private void MariaDB() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MariaDB.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) MariaDBButton.getScene().getWindow();

        stage.setTitle("WhichLanguage");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
