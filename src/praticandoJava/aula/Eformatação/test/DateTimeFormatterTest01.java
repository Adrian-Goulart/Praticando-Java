package praticandoJava.aula.Eformatação.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate p1 = LocalDate.parse("20260129", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate p2 = LocalDate.parse("2026-01-29", DateTimeFormatter.ISO_DATE);
        LocalDate p3 = LocalDate.parse("2026-01-29", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime p4 = LocalDateTime.parse("2026-01-29T13:34:01.16693005", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(p4);

        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(formatterBr);
        System.out.println(formatBr);
        LocalDate parseBr = LocalDate.parse("29/01/2026", formatterBr);
        System.out.println(parseBr);

        DateTimeFormatter formatterJp = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.JAPAN);
        String formatJapan = LocalDate.now().format(formatterJp);
        System.out.println(formatJapan);
        LocalDate parseJp = LocalDate.parse("29-01-2026", formatterJp);
        System.out.println(parseJp);
    }
}
