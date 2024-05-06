package ProFuncionalExpressoesLambidas.Stream.exercicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(Double.parseDouble(fields[1]), fields[0]));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(product -> product.getPrice())
                    .reduce(0.0, ( x, y) -> x + y) / list.size();

            System.out.println("Everage price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> names = list.stream()
                    .filter(product -> product.getPrice() < avg)
                    .map(product -> product.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
        sc.close();
    }
}
