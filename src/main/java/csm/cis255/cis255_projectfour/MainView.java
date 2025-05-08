import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class MainView extends Application {

    @Override
    public void start(Stage stage) {
        VBox menuVBox = new VBox(20);
        menuVBox.setPrefSize(220, 200);
        menuVBox.setAlignment(Pos.TOP_CENTER);

        Insets firstComboBoxMargin = new Insets(80, 0, 0, 0);

        ComboBox<String> countyNameComboBox = new ComboBox<>();
        countyNameComboBox.setPromptText("County Name");
        countyNameComboBox.setPrefSize(200, 25);
        VBox.setMargin(countyNameComboBox, firstComboBoxMargin);

        ComboBox<String> geographicalLocaleComboBox = new ComboBox<>();
        geographicalLocaleComboBox.setPromptText("Geographical Locale");
        geographicalLocaleComboBox.setPrefSize(200, 25);

        ComboBox<String> gradeLevelComboBox = new ComboBox<>();
        gradeLevelComboBox.setPromptText("Grade Level");
        gradeLevelComboBox.setPrefSize(200, 25);

        Button searchButton = new Button("Search");
        searchButton.setOnAction(e -> onSearchButtonClick());

        Button loadAllButton = new Button("Load All");
        loadAllButton.setOnAction(e -> onLoadAllButtonClick());

        Button resetButton = new Button("Reset");
        resetButton.setOnAction(e -> onResetButtonClick());

        menuVBox.getChildren().addAll(
            countyNameComboBox,
            geographicalLocaleComboBox,
            gradeLevelComboBox,
            searchButton,
            loadAllButton,
            resetButton
        );

        TextFlow textFlow = new TextFlow();
        textFlow.setPrefSize(956, 718);

        ScrollPane scrollPane = new ScrollPane(textFlow);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        SplitPane splitPane = new SplitPane();
        splitPane.setOrientation(Orientation.HORIZONTAL);
        splitPane.setDividerPositions(0.25);
        splitPane.getItems().addAll(menuVBox, scrollPane);

        Scene scene = new Scene(splitPane, 1280, 720);
        stage.setTitle("Big Data GUI");
        stage.setScene(scene);
        stage.show();
    }

    private void onSearchButtonClick() {
        System.out.println("Search clicked.");
    }

    private void onLoadAllButtonClick() {
        System.out.println("Load All clicked.");
    }

    private void onResetButtonClick() {
        System.out.println("Reset clicked.");
    }

    public static void main(String[] args) {
        launch();
    }
}
