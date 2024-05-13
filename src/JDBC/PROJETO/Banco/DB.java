package JDBC.PROJETO.Banco;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection() throws IOException {
        if ( conn == null ) {
            try {
                Properties prop = loadProperties();
                String url = prop.getProperty("dburl");
                conn = DriverManager.getConnection(url, prop);
            } catch (SQLException e) {
                throw new DbExecption(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbExecption(e.getMessage());
            }
        }
    }

    private static Properties loadProperties() throws IOException {
        try(FileInputStream fs = new FileInputStream("db.properties")) {
            Properties prop = new Properties();
            prop.load(fs);
            return prop;
        } catch (IOException e) {
            throw new DbExecption(e.getMessage());
        }
    }
}
