package JDBC.PROJETO;

import JDBC.Modelo_PUT.DB;

import java.io.IOException;

public class DaoFactory {

    public static SellerDao createSellerDao() throws IOException {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
