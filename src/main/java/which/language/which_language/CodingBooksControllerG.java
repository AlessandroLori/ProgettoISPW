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

public class CodingBooksControllerG implements Initializable{

    @FXML
    private Button BackStartWithPlatButton;

    @FXML
    private void BackStartWithPlat() throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StartWithPlat.fxml")));
        Scene sceneC= new Scene(root, 690, 518);
        Stage stage= (Stage) BackStartWithPlatButton.getScene().getWindow();

        stage.setTitle("WHICH LANGUAGE");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
