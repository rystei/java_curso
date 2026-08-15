package secao11.convert;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Global {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("2026-08-15");
        LocalDateTime localDateTime = LocalDateTime.parse("2026-08-15T14:16:26");
        Instant instant = Instant.parse("2026-08-15T00:16:26Z");

        LocalDate resultado = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        LocalDate resultado2 = LocalDate.ofInstant(instant, ZoneId.of("Portugal"));
        LocalDateTime resultado3 = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        LocalDateTime resultado4 = LocalDateTime.ofInstant(instant, ZoneId.of("Portugal"));

        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);

        System.out.println("Dia " + localDate.getDayOfMonth());
        System.out.println("Mês " + localDate.getMonthValue());
        System.out.println("Mês " + localDate.getYear());

        System.out.println("Hora " + localDateTime.getHour());
        System.out.println("Minuto " + localDateTime.getMinute());


    }
}
