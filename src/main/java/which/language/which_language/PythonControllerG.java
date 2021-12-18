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

public class PythonControllerG implements Initializable {
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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
