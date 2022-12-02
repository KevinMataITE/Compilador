package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import kevin.parser.Ecepcion;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Visual Studio Tepito Version ");
        primaryStage.setScene(new Scene(root, 820, 799));
        primaryStage.getIcons().add(new Image("file:calculator.png"));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
