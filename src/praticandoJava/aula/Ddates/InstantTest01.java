package praticandoJava.aula.Ddates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(Instant.ofEpochSecond(5, 1_000_000_000));
        System.out.println(now.getEpochSecond() * 1000000000L);
    }
}
