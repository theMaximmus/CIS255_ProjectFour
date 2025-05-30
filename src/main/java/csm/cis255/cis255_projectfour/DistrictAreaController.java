package csm.cis255.cis255_projectfour;

import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Separator;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import static csm.cis255.cis255_projectfour.DistrictArea.districtAreaList;
import static csm.cis255.cis255_projectfour.DistrictArea.filteredDistrictAreaList;

import java.util.Collections;

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


    @FXML
    protected void onSearchButtonClick() {
        // Obtain drop-down menu (ComboBox) values
        String countyName = !countyNameComboBox.getSelectionModel().isEmpty() ? countyNameComboBox.getSelectionModel().getSelectedItem().toString() : null;
        String geographicalLocale = !geographicalLocaleComboBox.getSelectionModel().isEmpty() ? geographicalLocaleComboBox.getSelectionModel().getSelectedItem().toString() : null;
        String gradeLevel = !gradeLevelComboBox.getSelectionModel().isEmpty() ? gradeLevelComboBox.getSelectionModel().getSelectedItem().toString() : null;

        if (isNeitherNullOrEmpty(countyName) && isNeitherNullOrEmpty(geographicalLocale) && isNeitherNullOrEmpty(gradeLevel)) {
            // Search and filter the data
            DistrictArea.searchAndListDataByCountyGradeLocale(countyName, geographicalLocale, gradeLevel);
            // Populate the filtered data
            populateFilteredData();
        } else if (isNeitherNullOrEmpty(countyName) && isNeitherNullOrEmpty(geographicalLocale)) {
            // Search and filter the data
            DistrictArea.searchAndListDataByCountyLocale(countyName, geographicalLocale);
            // Populate the filtered data
            populateFilteredData();
        } else if (isNeitherNullOrEmpty(countyName) && isNeitherNullOrEmpty(gradeLevel)) {
            // Search and filter the data
            DistrictArea.searchAndListDataByCountyGrade(countyName, gradeLevel);
            // Populate the filtered data
            populateFilteredData();
        } else if (isNeitherNullOrEmpty(geographicalLocale) && isNeitherNullOrEmpty(gradeLevel)) {
            // Search and filter the data
            DistrictArea.searchAndListDataByGradeLocale(geographicalLocale, gradeLevel);
            // Populate the filtered data
            populateFilteredData();
        } else if (isNeitherNullOrEmpty(countyName)) {
            // Search and filter the data
            DistrictArea.searchAndListDataByCounty(countyName);
            // Populate the filtered data
            populateFilteredData();
        } else if (isNeitherNullOrEmpty(geographicalLocale)) {
            // Search and filter the data
            DistrictArea.searchAndListDataByLocale(geographicalLocale);
            // Populate the filtered data
            populateFilteredData();
        } else if (isNeitherNullOrEmpty(gradeLevel)) {
            // Search and filter the data
            DistrictArea.searchAndListDataByGrade(gradeLevel);
            // Populate the filtered data
            populateFilteredData();
        }
    }

    /**
     * Loads all data from the data set and displays it on the screen
     */
    @FXML
    protected void onLoadAllButtonClick() {
        // Print a message in console indicating a successful load of the data file
        System.out.println("Successfully loaded DistrictAreasCSV.csv file");
        DistrictArea.loadAllData();
        populateAllData();
    }

    /**
     * Clears the TextFlow view from any displayed notes. Also keeps any ComboBox values and clears filtered list.
     */
    @FXML
    protected void onResetButtonClick() {
        // Clear TextFlow
        textFlow.getChildren().clear();

        // Clear each drop-down menu (ComboBox) and return the Prompt Text
        String countyNameComboBoxValue = countyNameComboBox.getSelectionModel().toString();
        countyNameComboBox.getSelectionModel().clearSelection();

        geographicalLocaleComboBox.getSelectionModel().clearSelection();
        geographicalLocaleComboBox.setPromptText("Geographical Locale");

        gradeLevelComboBox.getSelectionModel().clearSelection();
        gradeLevelComboBox.setPromptText("Grade Level");

        // Clear the filtered list (filteredDistrictAreaList)
        filteredDistrictAreaList.clear();

        // Print a message in the console
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

    /**
     * Helper method that checks the passed values obtained from the drop-down menu (ComboBox).
     * @param string Obtained value..
     * @return Returns false if the parameter is either empty or null..
     */
    private static boolean isNeitherNullOrEmpty(String string) {
        return string != null && !string.isEmpty();
    }

    /**
     * Populates filtered data in the TextFlow
     */
    private void populateFilteredData() {
        // Clear prompt text
        textFlow.getChildren().clear();
        // load filtered data
        for (DistrictArea districtArea : filteredDistrictAreaList) {
            textFlow.getChildren().add(new Text(districtArea.toString()));
            Separator horizontalSeparator = new Separator(Orientation.HORIZONTAL);
            horizontalSeparator.setMinWidth(textFlow.getWidth());
            textFlow.getChildren().add(horizontalSeparator);
            textFlow.getChildren().add(new Text("\n"));
        }
    }

    /**
     * Populates all data in the TextFlow
     */
    private void populateAllData() {
        // Clear prompt text
        textFlow.getChildren().clear();
        // load filtered data
        for (DistrictArea districtArea : districtAreaList) {
            textFlow.getChildren().add(new Text(districtArea.toString()));
            Separator horizontalSeparator = new Separator(Orientation.HORIZONTAL);
            horizontalSeparator.setMinWidth(textFlow.getWidth());
            textFlow.getChildren().add(horizontalSeparator);
            textFlow.getChildren().add(new Text("\n"));
        }
    }
}