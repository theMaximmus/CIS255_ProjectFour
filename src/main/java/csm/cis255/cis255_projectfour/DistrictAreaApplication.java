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
//        splitPane = new SplitPane();
//        splitPane.setId("splitPane");
//        splitPane.setDividerPositions(0.25);
//
//        menuVBox = new VBox();
//        menuVBox.setId("menuVBox");
//        menuVBox.setAlignment(TOP_CENTER);
//        menuVBox.setSpacing(20);
//        VBox.setMargin(menuVBox, new Insets(80, 0, 0, 0));
//
//        textFlow = new TextFlow();
//
//        countyNameComboBox = new ComboBox<>();
//        countyNameComboBox.setPromptText("County Name");
//        countyNameComboBox.setId("countyNameComboBox");
//        countyNameComboBox.setMinWidth(200);
//
//        geographicalLocaleComboBox = new ComboBox<>();
//        geographicalLocaleComboBox.setPromptText("Geographical Locale");
//        geographicalLocaleComboBox.setId("geographicalLocaleComboBox");
//        geographicalLocaleComboBox.setMinWidth(200);
//
//        gradeLevelComboBox = new ComboBox<>();
//        gradeLevelComboBox.setPromptText("Grade Level");
//        gradeLevelComboBox.setId("gradeLevelComboBox");
//        gradeLevelComboBox.setMinWidth(200);
//
//        searchButton = new Button();
//        searchButton.setText("Search");
//        searchButton.setId("searchButton");
//        searchButton.setMinWidth(100);
//        searchButton.setOnAction(actionEvent -> onSearchButtonClick());
//
//        loadAllButton = new Button();
//        loadAllButton.setId("loadAllButton");
//        loadAllButton.setText("Load All");
//        loadAllButton.setMinWidth(100);
//        /**
//         * Loads all data from the data set and displays it on the screen
//         */
//        loadAllButton.setOnAction(actionEvent -> {
//            DistrictArea.loadAllData();
//            for (DistrictArea districtArea : districtAreaList) {
//                textFlow.getChildren().add(new Text(districtArea.toString()));
//                Separator horizontalSeparator = new Separator(Orientation.HORIZONTAL);
//                horizontalSeparator.setMinWidth(textFlow.getWidth());
//                textFlow.getChildren().add(horizontalSeparator);
//                textFlow.getChildren().add(new Text("\n"));
//            }
//        });
//
//        resetButton = new Button();
//        resetButton.setText("Reset");
//        resetButton.setId("resetButton");
//        resetButton.setMinWidth(100);
//        resetButton.setOnAction(actionEvent -> {
//            textFlow.getChildren().clear();
//            System.out.println("Successfully cleared the TextFlow view");
//        });
//
//        scrollPane = new ScrollPane();
//        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
//        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
//
//        menuVBox.getChildren().addAll(countyNameComboBox, geographicalLocaleComboBox, gradeLevelComboBox, searchButton, loadAllButton, resetButton);
//        scrollPane.setContent(textFlow);
//        splitPane.getItems().addAll(menuVBox, scrollPane);
        FXMLLoader fxmlLoader = new FXMLLoader(DistrictAreaApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("California School District Areas 2023-24");
        stage.setScene(scene);
        stage.show();

        controllerInstance = fxmlLoader.getController();
    }

    public static void main(String[] args) {
        launch();
    }

    public DistrictAreaController getControllerInstance() {
        return controllerInstance;
    }

    private void onSearchButtonClick() {
        System.out.println("Search clicked.");
        DistrictArea.fillListAndMap();
        for (DistrictArea districtArea : districtAreaList) {
            uniqueCounties.add(districtArea.getCountyName());
            countyNameComboBox.getItems().add(districtArea.getCountyName());
            textFlow.getChildren().add(new Text(districtArea.toString()));
            Separator horizontalSeparator = new Separator(Orientation.HORIZONTAL);
            horizontalSeparator.setMinWidth(textFlow.getWidth());
            textFlow.getChildren().add(horizontalSeparator);
            textFlow.getChildren().add(new Text("\n"));
        }
    }

    private void onLoadAllButtonClick() {
        System.out.println("Load All clicked.");
    }

    private void onResetButtonClick() {
        System.out.println("Reset clicked.");
    }


}