package JDBC.Modelo03;

import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws IOException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement pprt = null;

        try {
            conn = DB.getConnection();

            /*
            pprt = conn.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            pprt.setString(1, "Carl Purple");
            pprt.setString(2, "carlpurple@gmail.com");
            pprt.setDate(3, new java.sql.Date(sdf.parse("22/04/1986").getTime()));
            pprt.setDouble(4, 6000.0);
            pprt.setInt(5, 4);
            */

            pprt = conn.prepareStatement(
                    "insert into department (Name) values ('Material'), ('Wood')", Statement.RETURN_GENERATED_KEYS);

            int rowsAffected = pprt.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = pprt.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No rows affected");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatment(pprt);
            DB.closeConnection();
        }
    }
}
