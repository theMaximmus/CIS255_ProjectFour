module csm.cis255.cis255_projectfour {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens csm.cis255.cis255_projectfour to javafx.fxml;
    exports csm.cis255.cis255_projectfour;
}