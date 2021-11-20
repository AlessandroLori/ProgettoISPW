package which.language.which_language;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Register extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Registration.fxml")));

        Scene sceneRegister= new Scene(root, 690,518);

        stage.setTitle("Registration");
        stage.setScene(sceneRegister);
        stage.setResizable(false);
        stage.show();
    }
}
