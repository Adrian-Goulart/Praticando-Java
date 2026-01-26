package praticandoJava.aula.Ddates;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);

        Period p3 = Period.ofWeeks(9);
        long p6 = now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS);

        System.out.println(p6);
    }
}
