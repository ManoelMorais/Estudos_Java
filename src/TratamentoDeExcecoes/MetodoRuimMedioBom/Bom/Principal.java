package TratamentoDeExcecoes.MetodoRuimMedioBom.Bom;

import TratamentoDeExcecoes.MetodoRuimMedioBom.Reservation3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            try {
                System.out.println("Room number: ");
                int number = sc.nextInt();
                System.out.println("Check-In date (dd/MM/yyyy): ");
                Date checkIn = sdf.parse(sc.next());
                System.out.println("Check-Out date (dd/MM/yyyy): ");
                Date checkOut = sdf.parse(sc.next());

                Reservation3 reservation3 = new Reservation3(number, checkIn, checkOut);
                System.out.println("Reservation: " + reservation3);

                System.out.println();
                System.out.println("Enter data to update the reservation: ");
                System.out.println("Check-In date (dd/MM/yyyy): ");
                checkIn = sdf.parse(sc.next());
                System.out.println("Check-Out date (dd/MM/yyyy): ");
                checkOut = sdf.parse(sc.next());

                reservation3.updateDate(checkIn, checkOut);
                System.out.println("Reservation: " + reservation3);
            } catch (ParseException e){
                System.out.println("Invalid date format");
            } catch (Execoes e) {
                System.out.println("error in reservation " + e);
            } catch (RuntimeException e){
                System.out.println("Unexpected error");
            }
            sc.close();
    }
}
