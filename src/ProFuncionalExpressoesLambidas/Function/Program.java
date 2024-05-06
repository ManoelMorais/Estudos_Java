package ProFuncionalExpressoesLambidas.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // MODO 01
        // List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        // names.forEach(System.out::println);

        // MODO 02
        // List<String> names = list.stream().map(Product::staticUpperCase).collect(Collectors.toList());
        // names.forEach(System.out::println);

        // MODO 03
        // List<String> names = list.stream().map(Product::NoStaticUpperCase).collect(Collectors.toList());
        // names.forEach(System.out::println);

        // MODO04
        // Function<Product, String> func = product -> product.getName().toUpperCase();

        // List<String> names = list.stream().map(func).collect(Collectors.toList());
        // names.forEach(System.out::println);

        // MODO05
        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}
