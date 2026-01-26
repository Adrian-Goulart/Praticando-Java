package praticandoJava.aula.Ddates;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        now = LocalDateTime.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDateTime.now().with(TemporalAdjusters.next(now.getDayOfWeek()));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDateTime.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDateTime.now().with(TemporalAdjusters.previous(now.getDayOfWeek()));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDateTime.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
