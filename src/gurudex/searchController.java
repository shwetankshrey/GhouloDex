package gurudex;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.sql.ResultSet;

/**
 * Created by Shwetank Shrey on 18-04-2018.
 */
public class searchController {

    @FXML private TextField searchTxt;
    @FXML private ChoiceBox searchBy;

    ResultSet rs;

    @FXML public void goBack(MouseEvent mouseEvent) throws Exception {
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/start.fxml")), 1024, 768));
    }

    @FXML public void search(MouseEvent mouseEvent) throws Exception {
        String nm = searchTxt.getText();
        int i = searchBy.getSelectionModel().getSelectedIndex();
        String qry = "";
        switch (i) {
            case 0 : {
                Main.current_cat = 0;
                qry = "SELECT * FROM ghouls where NAME = \"" + nm + "\";";
                break;
            }
            case 1 : {
                Main.current_cat = 1;
                qry = "SELECT * FROM investigators where NAME = \"" + nm + "\";";
                break;
            }
            case 2 : {
                Main.current_cat = 2;
                qry = "SELECT * FROM kakuhou where NAME = \"" + nm + "\";";
                break;
            }
            case 3 : {
                Main.current_cat = 3;
                qry = "SELECT * FROM locations where NAME = \"" + nm + "\";";
                break;
            }
            case 4 : {
                Main.current_cat = 4;
                qry = "SELECT * FROM organizations where NAME = \"" + nm + "\";";
                break;
            }
        }
        rs = Main.sql.executeQuery(qry);
        int t = 0;
        while (rs.next()) {
            t = rs.getInt(1) - 1;
            break;
        }
        Main.current_val = t;
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/screen.fxml")), 1024, 768));
        return;
    }
}
