package gurudex;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.sql.ResultSet;


/**
 * Created by Shwetank Shrey on 18-04-2018.
 */
public class complexOutController {

    @FXML private Label outLbl;

    ResultSet rs;

    @FXML public void initialize() throws Exception {
        switch (complexController.mode) {
            case 1: {
                String qry = "select kakuhou, count(kakuhou) from ghouls group by kakuhou order by count(kakuhou) desc;";
                rs = Main.sql.executeQuery(qry);
                String out = "Kagune by number among the Ghouls:\n";
                while (rs.next()) {
                    out = out + rs.getString(1) + " -> " + rs.getInt(2) + "\n";
                }
                qry = "select organization, count(organization) from ghouls group by organization order by count(organization) desc;";
                rs = Main.sql.executeQuery(qry);
                out = out + "\nOrganizations by number among the Ghouls:\n";
                while (rs.next()) {
                    out = out + rs.getString(1) + " -> " + rs.getInt(2) + "\n";
                }
                qry = "select location, count(location) from ghouls group by location order by count(location) desc;";
                rs = Main.sql.executeQuery(qry);
                out = out + "\nLocations by number among the Ghouls:\n";
                while (rs.next()) {
                    out = out + rs.getString(1) + " -> " + rs.getInt(2) + "\n";
                }
                outLbl.setText(out);
                break;
            }
            case 2: {
                String qry = "select rank, count(rank) from investigators group by rank order by count(rank) desc;";
                rs = Main.sql.executeQuery(qry);
                String out = "Rank by number among the Investigators:\n";
                while (rs.next()) {
                    out = out + rs.getString(1) + " -> " + rs.getInt(2) + "\n";
                }
                qry = "select gender, count(gender) from investigators group by gender order by gender desc;";
                rs = Main.sql.executeQuery(qry);
                out = out + "\nSex ratio among the Investigators:\n";
                while (rs.next()) {
                    out = out + rs.getString(1) + " -> " + rs.getInt(2) + "\n";
                }
                outLbl.setText(out);
                break;
            }
            case 3: {
                String qry = "select g.name, k.pros from ghouls as g inner join kakuhou as k on g.kakuhou = k.name;";
                rs = Main.sql.executeQuery(qry);
                String out = "Strength of some Ghouls:\n";
                while (rs.next()) {
                    out = out + rs.getString(1) + " -> " + rs.getString(2) + "\n";
                }
                outLbl.setText(out);
                break;
            }
            case 4: {
                String qry = "select g.name, k.cons from ghouls as g inner join kakuhou as k on g.kakuhou = k.name;";
                rs = Main.sql.executeQuery(qry);
                String out = "Weaknesses of some Ghouls:\n";
                while (rs.next()) {
                    out = out + rs.getString(1) + " -> " + rs.getString(2) + "\n";
                }
                outLbl.setText(out);
                break;
            }
            case 5: {
                String qry = "select avg(age) from ghouls;";
                rs = Main.sql.executeQuery(qry);
                String out = "Average age of Ghouls:\n";
                while (rs.next()) {
                    out = out + rs.getFloat(1) + "\n";
                }
                qry = "select avg(age) from investigators;";
                rs = Main.sql.executeQuery(qry);
                out = out + "\nAverage age of Investigators:\n";
                while (rs.next()) {
                    out = out + rs.getFloat(1) + "\n";
                }
                outLbl.setText(out);
                break;
            }
        }
    }

    @FXML public void goBack(MouseEvent mouseEvent) throws Exception {
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/start.fxml")), 1024, 768));
    }
}
