package which.language.which_language;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Buttons implements Initializable {

    //bottoni registrationfxml

    @FXML
    private Button LoginButton; //bottone schermata login

    @FXML
    private void Login() throws Exception{ //metodo con stesso nome fxml onAction
        CreateWindows.login(LoginButton);
    }

    //bottoni loginfxml
    @FXML
    private Button RegisterButton;

    @FXML
    private void Register() throws Exception{
        CreateWindows.register(RegisterButton);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}