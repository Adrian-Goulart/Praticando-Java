package praticandoJava.aula.Ddates;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);

        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(5);
        Period p3 = Period.ofWeeks(7);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(4);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}
