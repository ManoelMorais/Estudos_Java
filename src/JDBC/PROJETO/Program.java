package JDBC.PROJETO;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department dp = new Department(1, "Books");
        Seller seller = new Seller(21, "boby", "boby@gmail.com", new Date(), 3000.0, dp);

        //System.out.println(dp);
        System.out.println(seller);
    }
}