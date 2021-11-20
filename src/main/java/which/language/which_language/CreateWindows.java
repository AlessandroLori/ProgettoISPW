package which.language.which_language;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
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

    public static void login(Button Login) throws Exception {
        Parent root= FXMLLoader.load(Objects.requireNonNull(CreateWindows.class.getResource("Login.fxml")));
        create(Login,root,"Login");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
