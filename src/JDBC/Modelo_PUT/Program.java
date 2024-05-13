package JDBC.Modelo_PUT;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args)  {
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE "
                    + "(DepartmentId = ?)"
            );

            st.setDouble(1, 200.00);
            st.setInt(2, 2);

            int nowsAffected = st.executeUpdate();

            System.out.println("Done! " + nowsAffected);
        } catch (SQLException | IOException e){
            e.printStackTrace();
        } finally {
            DB.closeStatment(st);
            DB.closeConnection();
        }
    }
}
