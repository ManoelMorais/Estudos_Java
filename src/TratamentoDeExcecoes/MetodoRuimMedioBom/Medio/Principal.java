package TratamentoDeExcecoes.MetodoRuimMedioBom.Medio;

import TratamentoDeExcecoes.MetodoRuimMedioBom.Reservation2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-In date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Check-Out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation2 reservation2 = new Reservation2(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation2);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-In date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-Out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            String error = reservation2.updateDate(checkIn, checkOut);
            if (error != null){
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + reservation2);
            }

        }
        sc.close();
    }
}
