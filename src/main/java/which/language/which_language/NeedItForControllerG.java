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

public class NeedItForControllerG implements Initializable {

    @FXML
    private Button ScryptingButton;
    @FXML
    private Button WebDevelopButton;
    @FXML
    private Button DataBaseButton;
    @FXML
    private Button AIButton;
    @FXML
    private Button GameDevButton;
    @FXML
    private Button MachineLearningButton;
    @FXML
    private Button MobileDevButton;
    @FXML
    private Button FunEsoButton;
    @FXML
    private Button SoftDevButton;

    @FXML
    private void Scrypting() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scrypting.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) ScryptingButton.getScene().getWindow();

        stage.setTitle("Scrypting");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void WebDevelop() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("WebDevelopment.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) WebDevelopButton.getScene().getWindow();

        stage.setTitle("WebDevelopment");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void DataBase() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("DataBase.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) DataBaseButton.getScene().getWindow();

        stage.setTitle("DataBase");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void AI() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AI.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) AIButton.getScene().getWindow();

        stage.setTitle("ArtificialIntelligence");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void GameDev() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("GameDevelopment.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) GameDevButton.getScene().getWindow();

        stage.setTitle("GameDevelopment");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void MachineLearning() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MachineLearning.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) MachineLearningButton.getScene().getWindow();

        stage.setTitle("MachineLearning");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void MobileDev() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MobileDevelopment.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) MobileDevButton.getScene().getWindow();

        stage.setTitle("MobileDevelopment");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void Esoteric() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("EsotericLanguage.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) FunEsoButton.getScene().getWindow();

        stage.setTitle("EsotericLanguage");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void SoftDev() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SoftwareDevelopment.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) SoftDevButton.getScene().getWindow();

        stage.setTitle("SoftwareDevelopment");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
