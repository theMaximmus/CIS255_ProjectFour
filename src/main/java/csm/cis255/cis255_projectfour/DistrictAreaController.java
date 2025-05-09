package csm.cis255.cis255_projectfour;

import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Separator;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import static csm.cis255.cis255_projectfour.DistrictArea.districtAreaList;

public class DistrictAreaController {
    private static DistrictAreaController instance;

    public static DistrictAreaController getInstance() {
        return instance;
    }

    @FXML
    public void initialize() {
        instance = this;
    }

    @FXML
    TextFlow textFlow = new TextFlow();

    @FXML
    ComboBox countyNameComboBox = new ComboBox<>();

    @FXML
    ComboBox geographicalLocaleComboBox = new ComboBox<>();

    @FXML
    ComboBox gradeLevelComboBox = new ComboBox<>();

    @FXML
    Button searchButton = new Button();

    @FXML
    Button loadAllButton = new Button();

    @FXML
    Button resetButton = new Button();


    // Create an Observable list of Grade levels of the gradeLevelComboBox ComboBox
//    static ObservableList<String> districtGradeLevelList = grade
    @FXML
    protected void onSearchButtonClick() {
        DistrictArea.fillListAndMap();
        for (DistrictArea districtArea : districtAreaList) {
            textFlow.getChildren().add(new Text(districtArea.toString()));
            Separator horizontalSeparator = new Separator(Orientation.HORIZONTAL);
            horizontalSeparator.setMinWidth(textFlow.getWidth());
            textFlow.getChildren().add(horizontalSeparator);
            textFlow.getChildren().add(new Text("\n"));
        }
    }

    /**
     * Loads all data from the data set and displays it on the screen
     */
    @FXML
    protected void onLoadAllButtonClick() {
        DistrictArea.loadAllData();
        for (DistrictArea districtArea : districtAreaList) {
            textFlow.getChildren().add(new Text(districtArea.toString()));
            Separator horizontalSeparator = new Separator(Orientation.HORIZONTAL);
            horizontalSeparator.setMinWidth(textFlow.getWidth());
            textFlow.getChildren().add(horizontalSeparator);
            textFlow.getChildren().add(new Text("\n"));
        }
    }

    /**
     * Clears the Text Flow view from any displayed notes.
     */
    @FXML
    protected void onResetButtonClick() {
        textFlow.getChildren().clear();
        System.out.println("Successfully cleared the TextFlow view");
    }




    /**
     * Helper method that adds GeographicalLocale enum to the ComboBox items list.
     * @param item GeographicalLocale instance.
     */
    public void addItemToGeographicalLocaleComboBox(DistrictArea.GeographicalLocale item) {
        geographicalLocaleComboBox.getItems().add(item);
    }

    /**
     * Helper method that adds GradeLevel enum to the ComboBox items list.
     * @param item GradeLevel instance.
     */
    public void addItemToGradeLevelComboBox(DistrictArea.GradeLevel item) {
        gradeLevelComboBox.getItems().add(item);
    }

    /**
     * Helper method that adds County Name to the ComboBox items list.
     * @param item County Name String instance.
     */
    public void addItemToCountyNameComboBox(String item) {
        countyNameComboBox.getItems().add(item);
    }
}