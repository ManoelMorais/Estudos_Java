package ProFuncionalExpressoesLambidas.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        System.out.println("Write the value factor: ");
        double factor = sc.nextDouble();

        // Modo 01
        list.forEach(new PriceUpdate());
        list.forEach(System.out::println);

        // Modo 02
        list.forEach(Product::staticPriceUpdate);
        list.forEach(System.out::println);

        // Modo 03
        list.forEach(Product::NoStaticPriceUpdate);
        list.forEach(System.out::println);

        // Modo04
        Consumer<Product> cons = product -> product.setPrice(product.getPrice() * factor);

        list.forEach(cons);
        list.forEach(System.out::println);

        // Modo 05
        list.forEach( product -> product.setPrice(product.getPrice() * factor));
        list.forEach(System.out::println);
    }
}
