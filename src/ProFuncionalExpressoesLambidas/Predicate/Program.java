package ProFuncionalExpressoesLambidas.Predicate;

import java.util.*;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(new ProductPredicate());
        list.removeIf(Product::staticProduct);
        list.removeIf(Product::NoStaticProduct);

        double min = 100.0;
        Predicate<Product> pred = p -> p.getPrice() > min;

        list.removeIf(pred);
        list.removeIf(p -> p.getPrice() > min);


        for (Product p : list) {
            System.out.println(p);
        }
    }
}
