module com.vapor.eduapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.jfoenix;

    opens com.vapor.eduapp to javafx.fxml;
    exports com.vapor.eduapp;
    exports com.vapor.eduapp.Controller;
    opens com.vapor.eduapp.Controller to javafx.fxml;
}