package Introducao.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercicio 01
        System.out.print("Exercicio 01");
        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        // Exercicio 02
        System.out.print("Exercicio 02");
        double R, a, pi = 3.14159;

        R = sc.nextDouble();

        a = pi * R * R;

        System.out.printf("A=%.4f%n", a);

        // Exercicio 03
        System.out.print("Exercicio 03");
        int Ai, Bi, C, D, dif;

        Ai = sc.nextInt();
        Bi = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        dif = Ai * Bi - C * D;

        System.out.println("DIFERENCA = " + dif);

        // Exercicio 04
        System.out.print("Exercicio 04");
        int numero, horas;
        double valorHora, salario;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = valorHora * horas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        // Exercicio 05
        System.out.print("Exercicio 05");
        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = sc.nextInt();
        qte1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qte2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        // Exercicio 06
        System.out.print("Exercicio 06");

        double Ar, Br, Cr, triangulo, circulo, trapezio, quadrado, retangulo;

        Ar = sc.nextDouble();
        Br = sc.nextDouble();
        Cr = sc.nextDouble();

        triangulo = Ar * Cr / 2.0;
        circulo = 3.14159 * Cr * Cr;
        trapezio = (Ar + Br) / 2.0 * Cr;
        quadrado = Br * Br;
        retangulo = Ar * Br;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}
