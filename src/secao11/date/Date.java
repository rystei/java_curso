package secao11.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {

        /*
        Por padrão a data vem no formato ISO 8601
         */

        LocalDate date = LocalDate.now();
        LocalDateTime  localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(localDateTime);
        System.out.println(instant);

    }
}
