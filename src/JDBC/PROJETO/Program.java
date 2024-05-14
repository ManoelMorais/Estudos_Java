package JDBC.PROJETO;

import java.io.IOException;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws IOException {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
