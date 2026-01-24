package praticandoJava.aula.Ddates;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDatesTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Dia semana: " + date.getDayOfWeek());
        System.out.println("Dia mês: " + date.getDayOfMonth());
        System.out.println("Mês: " + date.getMonth());
        System.out.println("Ano: " + date.getYear());
        System.out.println("Tamanho mês: " + date.lengthOfMonth());
        System.out.println("Bissexto: " + date.isLeapYear());
    }
}
