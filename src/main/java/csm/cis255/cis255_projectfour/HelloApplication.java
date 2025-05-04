package csm.cis255.cis255_projectfour;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    HelloController controllerInstance;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("California School District Areas 2023-24");
        stage.setScene(scene);
        stage.show();

        controllerInstance = fxmlLoader.getController();
    }

    public static void main(String[] args) {
        launch();
    }

    public HelloController getControllerInstance() {
        return controllerInstance;
    }
}