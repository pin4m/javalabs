package lab6;

/**
 * Created by pin4m on 20.11.2020.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandle {
    private DatabaseHandle() { };
    private static DatabaseHandle instance;

    public static DatabaseHandle getInstance() {
        if (instance == null) {
            instance = new DatabaseHandle();
        }
        return instance;
    }

    static final String DB_URL = System.getenv("LAB6_DB_URL");
    static final String USER = System.getenv("LAB6_DB_USER");
    static final String PASS = System.getenv("LAB6_DB_PASS");

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("PostgreSQL is yours! try it softly!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
