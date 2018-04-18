package gurudex;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

/**
 * Created by Shwetank Shrey on 19-04-2018.
 */
public class complexController {

    static int mode;

    @FXML public void simpleQ(MouseEvent mouseEvent) throws Exception {
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/start.fxml")), 1024, 768));
    }

    @FXML public void complex1(MouseEvent mouseEvent) throws Exception {
        mode = 1;
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/complexOut.fxml")), 1024, 768));
    }

    @FXML public void complex2(MouseEvent mouseEvent) throws Exception {
        mode = 2;
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/complexOut.fxml")), 1024, 768));
    }

    @FXML public void complex3(MouseEvent mouseEvent) throws Exception {
        mode = 3;
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/complexOut.fxml")), 1024, 768));
    }

    @FXML public void complex4(MouseEvent mouseEvent) throws Exception {
        mode = 4;
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/complexOut.fxml")), 1024, 768));
    }

    @FXML public void complex5(MouseEvent mouseEvent) throws Exception {
        mode = 5;
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/complexOut.fxml")), 1024, 768));
    }
}
