package HerancaPolimorfismo.FIxacao;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for ( int i = 1; i<=n; i++){
            System.out.println("Employee #" + i + " data: ");
            System.out.println("Outsourced (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Price: ");
            Double price = sc.nextDouble();

            if (ch == 'i'){
                System.out.println("Customs fee: ");
                Double fee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, fee));
            } else if (ch == 'c') {
                list.add(new Product(name, price));
            } else if (ch == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else {
                System.out.println("informações erradas");
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }
    }
}
