package gurudex;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.sql.ResultSet;

/**
 * Created by Shwetank Shrey on 18-04-2018.
 */
public class updateGhoulController {

    @FXML private TextField nameTF;
    @FXML private TextField aliasTF;
    @FXML private TextField speciesTF;
    @FXML private TextField statusTF;
    @FXML private TextField ageTF;
    @FXML private TextField genderTF;
    @FXML private TextField heightTF;
    @FXML private TextField locationTF;
    @FXML private TextField kakuTF;
    @FXML private TextField orgTF;

    ResultSet rs;

    @FXML public void initialize() throws Exception {
        if(Main.aou == 3) {
            String qry = "select * from ghouls where id = " + Main.current_val+1 + ";";
            rs = Main.sql.executeQuery(qry);
            while (rs.next()) {
                nameTF.setText(rs.getString("name"));
                nameTF.setEditable(false);
                aliasTF.setText(rs.getString("alias"));
                speciesTF.setText(rs.getString("species"));
                statusTF.setText(rs.getString("status"));
                ageTF.setText(rs.getString("age"));
                genderTF.setText(rs.getString("gender"));
                heightTF.setText(rs.getString("height"));
                locationTF.setText(rs.getString("location"));
                kakuTF.setText(rs.getString("kakuhou"));
                orgTF.setText(rs.getString("organization"));
                break;
            }
        }
    }

    @FXML public void addUpdate(MouseEvent mouseEvent) throws Exception {
        String nm = nameTF.getText();
        String al = aliasTF.getText();
        String sp = speciesTF.getText();
        String st = statusTF.getText();
        int ag = Integer.parseInt(ageTF.getText());
        String ge = genderTF.getText();
        int ht = Integer.parseInt(heightTF.getText());
        String lc = locationTF.getText();
        String ka = kakuTF.getText();
        String or = orgTF.getText();
        if (Main.aou == 1) {
            String qry = "select count(id) from ghouls;";
            rs = Main.sql.executeQuery(qry);
            int id = 0;
            while (rs.next()) {
                id = rs.getInt(1) + 1;
            }
            Main.current_val = id;
            qry = "insert into ghouls values (" + id + ",\"" + nm + "\",\"" +al + "\",\"" +sp + "\",\"" +st + "\"," +ag + ",\"" + ge + "\"," + ht + ",\"" + lc + "\",\"" + ka + "\",\"" + or + "\");";
            Main.sql.executeUpdate(qry);
        }
        else {
            String qry = "update ghouls set alias = \"" + al + "\", species = \"" + sp + "\", status = \"" + st + "\", age = " + ag + ", gender = \""
                    + ge + "\", height = " + ht + ", location = \"" + lc + "\", kakuhou = \"" + ka + "\", organization = \"" + or + "\" where name = \"" + nm + "\";";
            Main.sql.executeUpdate(qry);
        }
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/screen.fxml")), 1024, 768));
    }

    @FXML public void goBack(MouseEvent mouseEvent) throws Exception {
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/start.fxml")), 1024, 768));
    }
}
