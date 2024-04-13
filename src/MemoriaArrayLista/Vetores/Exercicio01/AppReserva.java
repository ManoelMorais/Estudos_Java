package MemoriaArrayLista.Vetores.Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class AppReserva {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AppReservaEntities[] room = new AppReservaEntities[10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int roomNumber = sc.nextInt();

            room[roomNumber] = new AppReservaEntities(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms");
        for (int i = 0; i < 10; i++) {
            if(room[i] != null) {
                System.out.println(i + ": " + room[i]);
            }
        }

        sc.close();
    }
}
