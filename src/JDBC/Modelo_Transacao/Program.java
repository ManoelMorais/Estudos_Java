package JDBC.Modelo_Transacao;

import JDBC.Modelo_DEL.DbIntegrityException;
import JDBC.Modelo_PUT.DB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) throws IOException, SQLException {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DB.getConnection();

            // LOGICA DE PROTEÇÂO
            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2000 WHERE DepartmentId = 1");

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3000 WHERE DepartmentId = 2");

            conn.commit();
            // FIM

            System.out.println("Rows1 " + rows1);
            System.out.println("Rows2 " + rows2);
        } catch (SQLException e){
            try {
                conn.rollback();
                throw new DbIntegrityException("Transaction roller back! Coused by: " + e.getMessage()) ;
            } catch (SQLException el) {
                throw new DbIntegrityException("Error trying to rollback! Coused by: " + el.getMessage()) ;
            }
        }  finally {
            DB.closeStatment(st);
            DB.closeConnection();
        }
    }
}
