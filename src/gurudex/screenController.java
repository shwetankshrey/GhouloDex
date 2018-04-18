package gurudex;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.sql.ResultSet;

/**
 * Created by Shwetank Shrey on 18-04-2018.
 */
public class screenController {

    ResultSet rs;

    @FXML private ChoiceBox categoryDrop;
    @FXML private ChoiceBox valuesDrop;
    @FXML private Label detailsLbl;

    @FXML public void initialize() throws Exception {
        rs = Main.sql.executeQuery("show tables;");
        while (rs.next()) {
            categoryDrop.getItems().removeAll();
            categoryDrop.getItems().add(rs.getString(1));
        }
        categoryDrop.getSelectionModel().select(Main.current_cat);
        updateCategory();
    }

    public void updateCategory() throws Exception {
        switch (Main.current_cat) {
            case 0: {
                rs = Main.sql.executeQuery("SELECT NAME FROM ghouls");
                valuesDrop.getItems().clear();
                while (rs.next()) {
                    valuesDrop.getItems().add(rs.getString(1));
                }
                valuesDrop.getSelectionModel().select(Main.current_val);
                updateGhoul();
                return;
            }
            case 1: {
                rs = Main.sql.executeQuery("SELECT NAME FROM investigators");
                valuesDrop.getItems().clear();
                while (rs.next()) {
                    valuesDrop.getItems().add(rs.getString(1));
                }
                valuesDrop.getSelectionModel().select(Main.current_val);
                updateInv();
                return;
            }
            case 2: {
                rs = Main.sql.executeQuery("SELECT NAME FROM kakuhou");
                valuesDrop.getItems().clear();
                while (rs.next()) {
                    valuesDrop.getItems().add(rs.getString(1));
                }
                valuesDrop.getSelectionModel().select(Main.current_val);
                updateOrg();
                return;
            }
            case 3: {
                rs = Main.sql.executeQuery("SELECT NAME FROM locations");
                valuesDrop.getItems().clear();
                while (rs.next()) {
                    valuesDrop.getItems().add(rs.getString(1));
                }
                valuesDrop.getSelectionModel().select(Main.current_val);
                updateLoc();
                return;
            }
            case 4: {
                rs = Main.sql.executeQuery("SELECT NAME FROM organizations");
                valuesDrop.getItems().clear();
                while (rs.next()) {
                    valuesDrop.getItems().add(rs.getString(1));
                }
                valuesDrop.getSelectionModel().select(Main.current_val);
                updateKaku();
                return;
            }
        }
    }

    public void updateGhoul() throws Exception {
        String name = (String) valuesDrop.getSelectionModel().getSelectedItem();
        String qry = "SELECT * FROM ghouls where NAME = \"" + name + "\";";
        rs = Main.sql.executeQuery(qry);
        while (rs.next()) {
            String str = rs.getString("name") + ", also known as " + rs.getString("alias") + ", is a"
                    + rs.getString("gender") + " " + rs.getString("species") + " with " + rs.getString("organization")
                    + ", is " + rs.getInt("Age") + " years of age and " + rs.getInt("height") + " cms tall, has a "
                    + rs.getString("kakuhou") + " kagune.";
            detailsLbl.setText(str);
            break;
        }
    }

    public void updateInv() throws Exception {
        String name = (String) valuesDrop.getSelectionModel().getSelectedItem();
        String qry = "SELECT * FROM investigators where NAME = \"" + name + "\";";
        rs = Main.sql.executeQuery(qry);
        while (rs.next()) {
            String str = rs.getString("name") + ", also known as " + rs.getString("alias") + ", is a"
                    + rs.getString("gender") + " investigator with " + rs.getString("organization")
                    + ", is " + rs.getInt("Age") + " years of age and " + rs.getInt("height") + " cms tall, has a "
                    + rs.getString("quinque") + " quinque.";
            detailsLbl.setText(str);
            break;
        }
    }

    public void updateOrg() throws Exception {
        String name = (String) valuesDrop.getSelectionModel().getSelectedItem();
        String qry = "SELECT * FROM organizations where NAME = \"" + name + "\";";
        rs = Main.sql.executeQuery(qry);
        while (rs.next()) {
            String str = rs.getString("name") + " : " + rs.getString("info");
            detailsLbl.setText(str);
            break;
        }
    }

    public void updateKaku() throws Exception {
        String name = (String) valuesDrop.getSelectionModel().getSelectedItem();
        String qry = "SELECT * FROM kakuhou where NAME = \"" + name + "\";";
        rs = Main.sql.executeQuery(qry);
        while (rs.next()) {
            String str = rs.getString("name") + " : " + rs.getString("info");
            detailsLbl.setText(str);
            break;
        }
    }

    public void updateLoc() throws Exception {
        String name = (String) valuesDrop.getSelectionModel().getSelectedItem();
        String qry = "SELECT * FROM locations where NAME = \"" + name + "\";";
        rs = Main.sql.executeQuery(qry);
        while (rs.next()) {
            String str = rs.getString("name") + " : " + rs.getString("info");
            detailsLbl.setText(str);
            break;
        }
    }

    public void updateValue() throws Exception {
        switch (Main.current_cat) {
            case 0 : {
                updateGhoul();
                return;
            }
            case 1 : {
                updateInv();
                return;
            }
            case 2 : {
                updateKaku();
                return;
            }
            case 3 : {
                updateLoc();
                return;
            }
            case 4 : {
                updateOrg();
                return;
            }
        }
    }

    @FXML public void showPrev(MouseEvent mouseEvent) throws Exception {
        int i = valuesDrop.getSelectionModel().getSelectedIndex() - 1;
        if(i >= 0) {
            Main.current_val = i;
            valuesDrop.getSelectionModel().select(Main.current_val);
            updateValue();
        }
    }

    @FXML public void showNext(MouseEvent mouseEvent) throws Exception {
        int i = valuesDrop.getSelectionModel().getSelectedIndex() + 1;
        if(i <= valuesDrop.getItems().size()) {
            Main.current_val = i;
            valuesDrop.getSelectionModel().select(Main.current_val);
            updateValue();
        }
    }

    @FXML public void updateCurrent(MouseEvent mouseEvent) throws Exception {
        Main.aou = 3;
        if(Main.current_cat == 0) {
            Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/updateGhoul.fxml")), 1024, 768));
        }
        else {
            Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/updateInvestigator.fxml")), 1024, 768));
        }
    }

    @FXML public void updateDisplay(MouseEvent mouseEvent) throws Exception {
        detailsLbl.setText("");
        if(Main.current_cat != categoryDrop.getSelectionModel().getSelectedIndex()) {
            valuesDrop.getSelectionModel().select(0);
        }
        Main.current_cat = categoryDrop.getSelectionModel().getSelectedIndex();
        int tmp = valuesDrop.getSelectionModel().getSelectedIndex();
        Main.current_val = 0;
        updateCategory();
        Main.current_val = tmp;
        valuesDrop.getSelectionModel().select(Main.current_val);
        updateValue();
    }

    @FXML public void goBack(MouseEvent mouseEvent) throws Exception {
        Main.stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/start.fxml")), 1024, 768));
    }
}
