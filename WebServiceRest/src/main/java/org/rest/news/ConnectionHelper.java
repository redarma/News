package org.rest.news;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionHelper {

    private String                  url      = null;
    private String                  driver   = null;
    private static ConnectionHelper instance = null;

    private ConnectionHelper() {

        String user = "root";
        String password = "root";

        try {
            ResourceBundle bundle = ResourceBundle.getBundle("news");
            driver = bundle.getString("jdbc.driver");

            Class.forName(driver);
            url = bundle.getString("jdbc.url") + "?user=" + user + "&password=" + password;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        if (instance == null) {
            instance = new ConnectionHelper();
        }
        try {
            return DriverManager.getConnection(instance.url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
