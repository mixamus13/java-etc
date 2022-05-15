package org.example.javaproblem.chapter3.p67_local_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String... args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a, MMM dd, yyyy");
        DateTimeFormatter zoneFormatter = DateTimeFormatter.ofPattern("hh:mm a, MMM dd, yyyy Z VV");

        LocalDateTime ldt = LocalDateTime.of(1978, Month.DECEMBER, 13, 02, 34);
        System.out.println("ldt.format(formatter) = " + ldt.format(formatter));

        ZonedDateTime auPerthDepart = ldt.atZone(ZoneId.of("Australia/Perth"));
        ZonedDateTime euBucharestDepart = auPerthDepart.withZoneSameInstant(ZoneId.of("Europe/Bucharest"));

        ZonedDateTime auPerthArrive = auPerthDepart.plusHours(15).plusMinutes(30);
        ZonedDateTime euBucharestArrive = auPerthArrive.withZoneSameInstant(ZoneId.of("Europe/Bucharest"));

        OffsetDateTime utcAtDepart = auPerthDepart.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();
        OffsetDateTime utcAtArrive = auPerthArrive.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();

        System.out.println("UTC time at depart is: " + utcAtDepart.format(formatter));
        System.out.println("UTC time at arrive is: " + utcAtArrive.format(formatter));
        System.out.println("\nAt depart, in Perth is: " + auPerthDepart.format(zoneFormatter));
        System.out.println("At arrive, in Perth is: " + auPerthArrive.format(zoneFormatter));
        System.out.println("\nAt depart, in Bucharest is: " + euBucharestDepart.format(zoneFormatter));
        System.out.println("At arrive, in Bucharest is: " + euBucharestArrive.format(zoneFormatter));

        ZonedDateTime myZone = ZonedDateTime.now();
        System.out.println("myZone = " + myZone);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("offsetDateTime = " + offsetDateTime);

        LocalDate born = LocalDate.of(1978, Month.DECEMBER, 13);
        LocalDate now = LocalDate.now();
        long years = ChronoUnit.YEARS.between(born, now);
        System.out.println("years = " + years);

        Period period = Period.between(born, now);
        System.out.print("My age = " + period.getYears());
        System.out.print(", and months = " + period.getMonths());
        System.out.println(", and days = " + period.getDays() + ".");
        System.out.println("period.getUnits() = " + period.getUnits());
        System.out.println("period.getChronology() = " + period.getChronology());
    }
}
