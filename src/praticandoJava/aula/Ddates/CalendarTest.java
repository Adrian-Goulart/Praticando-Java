package praticandoJava.aula.Ddates;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.roll(Calendar.HOUR, 20);

        Date date = calendar.getTime();
        System.out.println(date);
    }
}
