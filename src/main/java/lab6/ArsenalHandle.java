package lab6;

/**
 * Created by pin4m on 20.11.2020.
 */

import java.sql.Connection;

public interface ArsenalHandle {
    void insert(String name, String surname, String patronymic, String birthday);
    void searchByBirthday(String birthday);
    Connection getConn();
}
