package Introducao.Repeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercicio 01
        System.out.print("Exercicio 01");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // Exercicio 02
        System.out.print("Exercicio 02");

        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            if (y >= 10 && y <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        // Exercicio 03
        System.out.print("Exercicio 03");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        // Exercicio 04
        System.out.print("Exercicio 04");

        int ni = sc.nextInt();

        for (int i = 0; i < ni; i++) {

            int xi = sc.nextInt();
            int yi = sc.nextInt();

            if (yi == 0) {
                System.out.println("divisao impossivel");
            } else {
                double div = (double) xi / yi;
                System.out.printf("%.1f%n", div);
            }
        }

        // Exercicio 05
        System.out.print("Exercicio 05");

        int nii = sc.nextInt();

        int fat = 1;
        for (int i = 1; i <= nii; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        // Exercicio 06
        System.out.print("Exercicio 06");

        int ini = sc.nextInt();

        for (int i = 1; i <= ini; i++) {
            if (ini % i == 0) {
                System.out.println(i);
            }
        }

        // Exercicio 07
        System.out.print("Exercicio 07");

        int nI = sc.nextInt();

        for (int i = 1; i <= nI; i++) {

            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

        sc.close();
    }
}
