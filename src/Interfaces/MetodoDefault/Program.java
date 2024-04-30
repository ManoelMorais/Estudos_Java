package Interfaces.MetodoDefault;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        InteretService is = new USAlnterestService(1.0);
        double payments = is.payments(amount, months);

        System.out.println("Payments ofter: " + months + " months:");
        System.out.println(String.format("%.2f", payments));

        sc.close();
    }
}
