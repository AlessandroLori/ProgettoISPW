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
    private Button JavaButton;
    @FXML
    private Button CppButton;
    @FXML
    private Button CButton;
    @FXML
    private Button RButton;
    @FXML
    private Button BackNeedItForButton;

    @FXML
    private void BackNeedItFor() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("NeedItFor.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) BackNeedItForButton.getScene().getWindow();

        stage.setTitle("WHICH LANGUAGE");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

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
    private void Java() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Java.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) JavaButton.getScene().getWindow();

        stage.setTitle("WhichLanguage");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void Cpp() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("C++.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) CppButton.getScene().getWindow();

        stage.setTitle("Python");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void C() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("C.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) CButton.getScene().getWindow();

        stage.setTitle("WhichLanguage");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void R() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("R.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) RButton.getScene().getWindow();

        stage.setTitle("WhichLanguage");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
