package which.language.which_language;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class WelcomeControllerG extends CreateWindows implements Initializable {

    @FXML
    private Button StartButton;

    @FXML
    private void HowStart() throws Exception{
        CreateWindows.howstart(StartButton);
    }
}
