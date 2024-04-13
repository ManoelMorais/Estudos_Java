package MemoriaArrayLista.Vetores.Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar?");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i=0; i<vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        for(int i=0; i<vect.length; i++) {
            System.out.println("VALORES = " + vect[i]);
        }

        double soma = 0;
        for(int i=0; i<vect.length; i++) {
            soma = soma + vect[i];
        }

        System.out.printf("\nSOMA = %.2f\n", soma);

        double media = soma / n;
        System.out.printf("MEDIA = %.2f\n", media);
        sc.close();
    }
}
