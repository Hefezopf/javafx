package de.hopfit;

//import com.developer.exit.ExitApplication;
//import com.developer.util.css.AddCSS;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
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

//        stage.setOnCloseRequest(e -> {
//            e.consume();
//            ExitApplication ep = new ExitApplication();
//            ep.closeProgram(stage);
//        });

        //The part that I can't get to work
        root = FXMLLoader.load(getClass().getResource("/de/hopfit/first.fxml"));

        scene = new Scene(root);
      //  addcss.setStylesheet(scene);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
