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

public class LoginControllerG implements Initializable {

    //bottoni loginfxml
    @FXML
    private Button RegisterButton;

    @FXML
    private void Register() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Registration.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) RegisterButton.getScene().getWindow();

        stage.setTitle("Learning Question");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
        //CreateWindows.register(RegisterButton);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}