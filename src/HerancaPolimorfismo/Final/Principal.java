package HerancaPolimorfismo.Final;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TextPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Anual income: ");
            Double anualincome = sc.nextDouble();
            if ( ch == 'i'){
                System.out.println("Health expenditures: ");
                Double healthexpenditures = sc.nextDouble();
                list.add(new individual(name, anualincome, healthexpenditures));
            } else {
                System.out.println("Number of employees: ");
                int numberofemployees = sc.nextInt();
                list.add(new Company(name, anualincome, numberofemployees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TextPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
