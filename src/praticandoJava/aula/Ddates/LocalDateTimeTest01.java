package praticandoJava.aula.Ddates;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2025-07-05");
        LocalTime time = LocalTime.parse("14:52:33");
        LocalDateTime dateTime = date.atTime(time);
        LocalDateTime timeDate = time.atDate(date);

        System.out.println(timeDate);
        System.out.println(dateTime);
    }
}
