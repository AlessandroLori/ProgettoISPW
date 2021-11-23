package which.language.which_language;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class CreateWindows implements Initializable {

    private static void create(Button button, Parent root, String string){

        Scene sceneC= new Scene(root, 690,518);
        Stage stage= (Stage) button.getScene().getWindow();

        stage.setTitle(string);
        stage.setScene(sceneC);
        stage.setResizable(false);
        stage.show();
    }
    //registerfxml
    public static void login(Button Login) throws Exception {
        Parent root= FXMLLoader.load(Objects.requireNonNull(CreateWindows.class.getResource("Login.fxml")));
        create(Login,root,"Login");
    }

    public static void signup(Button SignUp) throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(CreateWindows.class.getResource("Welcome.fxml")));
        create(SignUp,root,"Start");
    }

    //loginfxml
    public static void register(Button Register) throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(CreateWindows.class.getResource("Registration.fxml")));
        create(Register,root,"Register");
    }

    //welcomefxml
    public static void howstart(Button Start) throws Exception{
        Parent root= FXMLLoader.load(Objects.requireNonNull(CreateWindows.class.getResource("LearningQuestion.fxml")));
        create(Start,root,"Learning Question");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
