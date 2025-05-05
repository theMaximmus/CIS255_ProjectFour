package csm.cis255.cis255_projectfour;

import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import static csm.cis255.cis255_projectfour.DistrictArea.districtAreaList;

public class HelloController {
    private static HelloController instance;

    public static HelloController getInstance() {
        return instance;
    }

    @FXML
    public void initialize() {
        instance = this;
    }

    @FXML
    TextFlow textFlow = new TextFlow();

    @FXML
    ComboBox gradeLevelComboBox = new ComboBox<>();

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
     * Helper method that adds GradeLevel enum to the ComboBox items list.
     * @param item GradeLevel instance.
     */
    public void addItemToGradeLevelComboBox(DistrictArea.GradeLevel item) {
        gradeLevelComboBox.getItems().add(item);
    }
}