package gurudex;

import java.sql.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://192.168.49.157:3306/Tokyo_Ghoul";

    static final String USER = "root";
    static String PASS = "12345";

    static Connection conn;
    static Statement sql;

    static Stage stage;

    static int current_cat = 0;
    static int current_val = 0;

    static int aou = 1;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        stage.setTitle("GhouloDex");
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("../resources/icon.png")));
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../resources/start.fxml")), 1024, 768));
        stage.show();
    }


    public static void main(String[] args) throws Exception {
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        sql = conn.createStatement();
        launch(args);
        System.out.println("Bye!");
        if (sql != null) {
            sql.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}
