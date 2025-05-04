package csm.cis255.cis255_projectfour;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class HelloController {

    @FXML
    TextFlow textFlow = new TextFlow();

    @FXML
    protected void onSearchButtonClick() {
        DistrictArea.fillListAndMap();
        textFlow.getChildren().add(new Text(DistrictArea.districtAreaList.get(0).toString()));
    }
}