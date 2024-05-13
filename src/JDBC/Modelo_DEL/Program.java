package JDBC.Modelo_DEL;

import JDBC.Modelo_PUT.DB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = JDBC.Modelo_PUT.DB.getConnection();

            st = conn.prepareStatement(
                    "DELETE FROM department "
                    + "WHERE "
                    + "Id = ?"
            );

            st.setInt(1, 6);

            int nowsAffected = st.executeUpdate();

            System.out.println("Done! " + nowsAffected);
        } catch (SQLException | IOException e){
           throw new DbIntegrityException(e.getMessage());
        } finally {
            JDBC.Modelo_PUT.DB.closeStatment(st);
            DB.closeConnection();
        }
    }
}
