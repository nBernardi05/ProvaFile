module bernardi.nicola.provafile {
    requires javafx.controls;
    requires javafx.fxml;

    opens bernardi.nicola.provafile to javafx.fxml;
    exports bernardi.nicola.provafile;
}
