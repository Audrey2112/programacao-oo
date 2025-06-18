package ed04.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    private static final String URL = "jdbc:postgresql://localhost:5432/agenda";
    private static final String USERNAME = "batman";
    private static final String PASSWORD = "banana";

    private DatabaseManager() {
        // Faz nada
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

}
