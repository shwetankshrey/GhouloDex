package gurudex;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

public class startController {

    @FXML public void showAll(MouseEvent mouseEvent) throws Exception {
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/screen.fxml")), 1024, 768));
    }

    @FXML public void search(MouseEvent mouseEvent) throws Exception {
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/search.fxml")), 1024, 768));
    }

    @FXML public void addGhoul(MouseEvent mouseEvent) throws Exception{
        Main.aou = 1;
        Main.current_cat = 0;
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/updateGhoul.fxml")), 1024, 768));
    }

    @FXML public void addInvestigator(MouseEvent mouseEvent) throws Exception{
        Main.aou = 1;
        Main.current_cat = 1;
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/updateInvestigator.fxml")), 1024, 768));
    }

    @FXML public void complexQ(MouseEvent mouseEvent) throws Exception {
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/complexQueries.fxml")), 1024, 768));
    }
}
