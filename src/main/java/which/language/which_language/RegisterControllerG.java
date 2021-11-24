package which.language.which_language;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

public class RegisterControllerG extends CreateWindows implements Initializable {
    //added fxcontroller in anchor pane con path controller interessato (in questo caso RegisterController)

    @FXML
    private Button LoginButton; //bottone schermata login
    @FXML
    private Button SignupButton;

    @FXML
    private void Login() throws Exception{ //metodo con stesso nome fxml onAction
        Parent root= FXMLLoader.load(Objects.requireNonNull(CreateWindows.class.getResource("Login.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) LoginButton.getScene().getWindow();

        stage.setTitle("Login");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void SignUp() throws Exception{ //metodo con stesso nome fxml onAction
        //CreateWindows.signup(SignupButton);
        Parent root= FXMLLoader.load(Objects.requireNonNull(CreateWindows.class.getResource("Welcome.fxml")));
        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) SignupButton.getScene().getWindow();

        stage.setTitle("Welcome");
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }
}
