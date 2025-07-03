package midterm.sql_injection;

import java.sql.*;

public class SQL_Injection {
    private static final String URL = "jdbc:mysql://localhost:3306/mpp";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Dpw123456";
    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD)){
            String email = "";
            String query = "select * from orders where email = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,email);
            ResultSet rs = preparedStatement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
