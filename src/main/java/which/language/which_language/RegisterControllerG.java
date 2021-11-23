package which.language.which_language;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RegisterControllerG extends CreateWindows implements Initializable {
    //added fxcontroller in anchor pane con path controller interessato (in questo caso RegisterController)

    @FXML
    private Button LoginButton; //bottone schermata login
    @FXML
    private Button SignupButton;

    @FXML
    private void Login() throws Exception{ //metodo con stesso nome fxml onAction
        CreateWindows.login(LoginButton);
    }

    @FXML
    private void Start() throws Exception{ //metodo con stesso nome fxml onAction
        CreateWindows.signup(SignupButton);
    }
}
