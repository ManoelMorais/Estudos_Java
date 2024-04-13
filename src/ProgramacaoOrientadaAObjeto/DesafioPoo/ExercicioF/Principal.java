package ProgramacaoOrientadaAObjeto.DesafioPoo.ExercicioF;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Entitie numer = new Entitie();

        System.out.println("Enter rectangle width and height:");
        numer.width = sc.nextDouble();
        numer.heigth = sc.nextDouble();

        System.out.println("AREA = " + numer.Area());
        System.out.println("PERIMETER = " + numer.Perimeter());
        System.out.println("DIAGONAL = " + numer.Diagonal());
        sc.close();
    }
}
