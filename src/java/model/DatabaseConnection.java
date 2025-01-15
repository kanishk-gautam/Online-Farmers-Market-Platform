package models;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection connect() {
        try {
            String url = ConfigLoader.get("db.url");
            String username = ConfigLoader.get("db.username");
            String password = ConfigLoader.get("db.password");
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
