package praticandoJava.aula.Ddates;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timeNow = LocalTime.now();
        LocalTime timePlus7Hours = LocalTime.now().plusHours(7);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timePlus7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(Duration.of(3, ChronoUnit.HOURS));
        // Duration.between(LocalDate.now(), LocalDate.now().plusYears(2));
    }
}
