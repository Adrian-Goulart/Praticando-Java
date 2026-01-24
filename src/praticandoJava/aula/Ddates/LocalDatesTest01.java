package praticandoJava.aula.Ddates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDatesTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 5, 30);

        System.out.println("Segundos dia: " + time.get(ChronoField.SECOND_OF_DAY));
        System.out.println("Minuto dia: " + time.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("Horas dia: " + time.get(ChronoField.HOUR_OF_DAY));
    }
}
