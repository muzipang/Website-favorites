package favorites.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application
{
    private boolean useSysWindowStyle = true;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        FXMLLoader mainWindowLoader;
        if (useSysWindowStyle)
        {
            mainWindowLoader = new FXMLLoader(getClass().getClassLoader().getResource("main-content.fxml"));
        }
        else
        {
            primaryStage.initStyle(StageStyle.UNDECORATED);
            mainWindowLoader = new FXMLLoader(getClass().getClassLoader().getResource("main-window.fxml"));

        }
        Parent root = mainWindowLoader.load();
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("main-window.css").toExternalForm());
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
