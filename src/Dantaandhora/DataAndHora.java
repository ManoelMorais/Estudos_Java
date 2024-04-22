package Dantaandhora;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static java.time.LocalDate.of;
import static java.time.LocalDate.parse;

public class DataAndHora {
    public static void main(String[] args){

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = parse("2024-03-25");
        LocalDateTime d05 = LocalDateTime.parse("2024-03-25T01:30:34");
        Instant d06 = Instant.parse("2024-03-25T01:30:34z");
        Instant d07 = Instant.parse("2024-03-25T01:30:34-03:00");

        LocalDate d08 = parse("25/03/2024", fmt1);
        LocalDate d09 = parse("25/03/2024 01:30", fmt2);

        LocalDate d10 = of(2024, 3, 25);
        LocalDateTime d11 = LocalDateTime.of(2023, 3, 20, 3, 40);

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        Instant pastWeekLocalInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekLocalInstant = d06.plus(7, ChronoUnit.DAYS);

        Duration t1 = Duration.between(pastWeekLocalDate, d05);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d06 = " + fmt3.format(d06));

        for (String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("d04 dia " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minute = " + d05.getMinute());

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("pastWeekLocalInstant = " + pastWeekLocalInstant);
        System.out.println("nextWeekLocalInstant = " + nextWeekLocalInstant);

        System.out.println("t1 dias = " + t1.toDays());
    }
}
