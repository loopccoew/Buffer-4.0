module com.loop.buffer.blockchaindsa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.loop.buffer.blockchaindsa to javafx.fxml;
    exports com.loop.buffer.blockchaindsa;
}