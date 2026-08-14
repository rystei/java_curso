package secao11.convert;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("2026-08-13");
        LocalDateTime localDateTime = LocalDateTime.parse("2026-08-13T21:30:55");
        Instant instant = Instant.parse("2026-08-13T21:30:55Z");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter zone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println("LocalDate = " + localDate.format(dateTimeFormatter));
        System.out.println("LocalDate = " + dateTimeFormatter.format(localDate));
        System.out.println("LocalDate = " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("LocalDatetime =  " + localDateTime.format(dateTimeFormatter));
        System.out.println("LocalDatetime =  " + localDateTime.format(dateTimeFormatter1));
        System.out.println("LocalDatetime =  " + localDateTime.format(dateTimeFormatter2));

        System.out.println("Instant = " + zone.format(instant));
    }
}
