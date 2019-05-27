package favorites.main;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import favorites.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        FXMLLoader mainWindowLoader;
        mainWindowLoader = new FXMLLoader(getClass().getClassLoader().getResource("main-content.fxml"));
        Parent root = mainWindowLoader.load();
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);

        MainController windowController = mainWindowLoader.getController();
        windowController.init();

        primaryStage.show();
    }
}
