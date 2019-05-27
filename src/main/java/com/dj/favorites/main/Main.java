package com.dj.favorites.main;

import java.io.IOException;

import com.dj.favorites.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
        mainWindowLoader = new FXMLLoader(getClass().getResource("/main-content.fxml"));
        Parent root = mainWindowLoader.load();
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);

        MainController windowController = mainWindowLoader.getController();
        windowController.init();

        primaryStage.show();
    }
}
