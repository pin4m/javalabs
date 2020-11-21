package lab6;

/**
 * Created by pin4m on 20.11.2020.
 */

import java.sql.*;

public class StudentHandle implements ArsenalHandle {
    private final DatabaseHandle databaseHandle = DatabaseHandle.getInstance();
    private final Connection conn = databaseHandle.connect();

    @Override
    public void insert(String name, String surname, String patronymic, String birthday) {
        try {
            String sql = "INSERT INTO students (name, surname, patronymic, birthday) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, surname);
            statement.setString(3, patronymic);
            statement.setString(4, birthday);
            statement.executeUpdate();
            System.out.println("Hooray! we've a new Student! us congrats!");
            statement.close();
        } catch (SQLException e) {
            System.out.println("Oops, we've a probs, Houston!");
        }
    }

    @Override
    public void searchByBirthday(String birthday) {
        try {
            String sql = "SELECT * FROM students WHERE birthday = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, birthday);
            ResultSet resultSet = statement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            int columns = resultSetMetaData.getColumnCount();
            int rowNumber = 1;

            while(resultSet.next()) {
                System.out.println("Row: " + rowNumber++);
                for (int i = 0; i < columns; i++) {
                    System.out.println("\tField: " + resultSetMetaData.getColumnLabel (i + 1) + ": " +
                            resultSet.getObject(i + 1) + ", ");
                }
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println("Oops, we've a probs, Houston!");
        }
    }

    public Connection getConn() {
        return conn;
    }
}

