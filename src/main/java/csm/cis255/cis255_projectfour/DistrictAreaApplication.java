package csm.cis255.cis255_projectfour;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import static csm.cis255.cis255_projectfour.DistrictArea.districtAreaList;

public class DistrictAreaApplication extends Application {
    DistrictAreaController controllerInstance;
    static Set<String> uniqueCounties = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

    public SplitPane splitPane;
    public VBox menuVBox;
    public ComboBox<Object> countyNameComboBox;
    public ComboBox<Object> geographicalLocaleComboBox;
    public ComboBox<Object> gradeLevelComboBox;
    public Button searchButton;
    public Button loadAllButton;
    public Button resetButton;
    public ScrollPane scrollPane;
    public TextFlow textFlow;

    @Override
    public void start(Stage stage) throws IOException {

        // Initialize all UI elements
        FXMLLoader fxmlLoader = new FXMLLoader(DistrictAreaApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("California School District Areas 2023-24");
        stage.setScene(scene);
        stage.show();

        controllerInstance = fxmlLoader.getController();
        controllerInstance.textFlow.getChildren().add(new Text("PLEASE CLICK 'Load All' BUTTON FIRST"));
    }

    public static void main(String[] args) {
        launch();
    }

    public DistrictAreaController getControllerInstance() {
        return controllerInstance;
    }

}