package ProgramacaoOrientadaAObjeto.DesafioPoo.ExercicioY;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Entitie notas = new Entitie();

        notas.name = sc.next();
        notas.A = sc.nextDouble();
        notas.B = sc.nextDouble();
        notas.C = sc.nextDouble();

        System.out.printf("Final GRADE = %.2f%n ", notas.Total());

        if (notas.Total() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", notas.Resu());
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
