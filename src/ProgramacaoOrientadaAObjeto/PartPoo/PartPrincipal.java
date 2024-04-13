package ProgramacaoOrientadaAObjeto.PartPoo;

import java.util.Locale;
import java.util.Scanner;

public class PartPrincipal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        PartProduto produtos = new PartProduto(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + produtos);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        produtos.addProdutc(quantity);

        System.out.println();
        System.out.println("Updated data: " + produtos);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        produtos.removeProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + produtos);
        sc.close();
    }
}
