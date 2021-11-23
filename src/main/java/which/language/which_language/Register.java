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

//gui ha controller grafico che manda a bin per controllo sintattico che manda a controller e basta per controllo
//database ed accertamento input corretto

//hashmap, submit manda credenziali al controller, il controller prende le credenziali dal database e manda al submit
//che confronta credenziali db con credenziali utenti e manda booleano per login

//TODO cambiare scene per passare da gui a gui senza creare nuovi stage ogni volta (altrimenti codice ripetuto o responsabilità
//TODO tutta ad un'unica classe che è sbagliato) forse meglio usare STACKPANE
