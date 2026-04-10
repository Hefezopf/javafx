package de.hopfit;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FirstFX extends Application {

    private Stage stage;
    private Scene scene;
    private final String title = "First Program 2.0";
    private Parent root;

    //private final AddCSS addcss = new AddCSS();

    @Override
    public void start(Stage primaryStage) throws IOException {

        stage = primaryStage;
        stage.setTitle(title);
        
        root = FXMLLoader.load(getClass().getResource("/de/hopfit/first.fxml"));
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	System.out.println("main.........");
        launch(args);
    }
}
