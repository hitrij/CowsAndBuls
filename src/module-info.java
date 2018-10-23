module CowsAndBuls {
    requires javafx.controls;
    requires javafx.fxml;
    exports CowsAndBulls to javafx.graphics, javafx.fxml;
    opens CowsAndBulls to javafx.fxml, javafx.base;


}