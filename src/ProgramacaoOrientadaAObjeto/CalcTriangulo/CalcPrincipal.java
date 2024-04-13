package ProgramacaoOrientadaAObjeto.CalcTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class CalcPrincipal {
    public static void main(String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // PROBLEMA SE ORIENTAÇÂO A OBJETO

        // Aula 01

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measure of triangle X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measure of triangle Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }


        // PROBLEMA COM ORIENTAÇÂO A OBJETO

        // Aula 02 conectada com a pasta classAulaPoo

        CalcTriangulo x, y;

        x = new CalcTriangulo();
        y = new CalcTriangulo();

        System.out.println("Enter the measure of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measure of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p1 = (x.a + x.b + x.c) / 2.0;
        double areaX1 = Math.sqrt(p1 * (p1 - x.a) * (p1 - x.b) * (p1 - x.c));

        p1 = (y.a + y.b + y.c) / 2.0;
        double areaY1 = Math.sqrt(p1 * (p1 - y.a) * (p1 - y.b) * (p1 - y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX1);
        System.out.printf("Triangle Y area: %.4f%n", areaY1);

        if (areaX1 > areaY1) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }


        // PROBLEMA COM ORIENTAÇÂO A OBJETO

        // Aula 03 conectada com a pasta classAulaPoo

        CalcTriangulo xl, yl;

        xl = new CalcTriangulo();
        yl = new CalcTriangulo();

        System.out.println("Enter the measure of triangle X:");
        xl.a = sc.nextDouble();
        xl.b = sc.nextDouble();
        xl.c = sc.nextDouble();

        System.out.println("Enter the measure of triangle Y:");
        yl.a = sc.nextDouble();
        yl.b = sc.nextDouble();
        yl.c = sc.nextDouble();

        double areaX1l = x.area();
        double areaY1l = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX1l);
        System.out.printf("Triangle Y area: %.4f%n", areaY1l);

        if (areaX1l > areaY1l) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

    }
}
