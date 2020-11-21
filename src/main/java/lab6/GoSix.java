package lab6;

/**
 * Created by pin4m on 20.11.2020.
 */

import java.sql.SQLException;

public class GoSix {
    public static void main(String[] args) throws SQLException {
        ArsenalHandle arsenalHandle = new StudentHandle();
        try {
            arsenalHandle.insert("Steve", "Paul", "Jobs", "1955-02-24");
            arsenalHandle.insert("Steve", "Gary", "Wozniak", "1950-08-11");
            arsenalHandle.insert("Bill", "Henry", "Gates", "1955-10-28");
            arsenalHandle.searchByBirthday("1955-02-24");
        } finally {
            arsenalHandle.getConn().close();
        }
    }
}
