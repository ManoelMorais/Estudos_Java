package MemoriaArrayLista.Vetores.Exercicio01;

import java.util.Scanner;

public class Negativo {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quanos numeros você vai digitar");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i=0; i<vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }


        for(int i=0;  i<vect.length; i++) {
            if(vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }

        sc.close();
    }
}
