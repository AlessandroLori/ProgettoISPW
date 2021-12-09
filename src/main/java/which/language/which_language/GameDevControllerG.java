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

public class GameDevControllerG implements Initializable {

    @FXML
    private Button PythonButton;
    @FXML
    private Button CppButton;
    @FXML
    private Button JavaButton;
    @FXML
    private Button CsharpButton;
    @FXML
    private Button LuaButton;

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

        stage.setTitle("WhichLanguage");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void Csharp() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("C#.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) CsharpButton.getScene().getWindow();

        stage.setTitle("WhichLanguage");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void Lua() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Lua.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) LuaButton.getScene().getWindow();

        stage.setTitle("Lua");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
