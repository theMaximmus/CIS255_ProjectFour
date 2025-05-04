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
        textFlow.getChildren().add(new Text(DistrictArea.districtAreaList.get(0).toString()));
        textFlow.getChildren().add(new Separator(Orientation.HORIZONTAL) );
        textFlow.getChildren().add(new Text(DistrictArea.districtAreaList.get(1).toString()));
    }

    public void addItemToGradeLevelComboBox(DistrictArea.GradeLevel item) {
        gradeLevelComboBox.getItems().add(item);
    }
}