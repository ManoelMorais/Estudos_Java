package ProgramacaoOrientadaAObjeto.DesafioPoo.ExercicioM;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Entitie valores = new Entitie();

        System.out.print("Name: ");
        valores.name = sc.next();
        System.out.print("Gross salary: ");
        valores.salary = sc.nextDouble();
        System.out.print("Tax: ");
        valores.tax = sc.nextDouble();

        System.out.println("Employee: " + valores);

        System.out.print("Which percentage to increase salary? ");
        double percentege = sc.nextDouble();
        valores.IncreaseSalary(percentege);

        System.out.println(valores);
        sc.close();

    }
}
