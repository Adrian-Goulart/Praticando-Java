package praticandoJava.aula.Ddates;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime birth = LocalDateTime.of(2007, 8, 2, 1, 0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(birth, now));
        System.out.println(ChronoUnit.WEEKS.between(birth, now));
        System.out.println(ChronoUnit.MONTHS.between(birth, now));
        System.out.println(ChronoUnit.YEARS.between(birth, now));
        System.out.println(ChronoUnit.SECONDS.between(birth, now));
    }
}
