package Java8Features.DateNTime;

import java.time.*;

public class instant {
    public static void main(String[] args) throws InterruptedException {
        long currentTimeMiles = System.currentTimeMillis();
        System.out.println(currentTimeMiles);
        Instant start = Instant.now();
        System.out.println(start);
        Thread.currentThread().sleep(1000);
        Instant end = Instant.now();

        Duration d = Duration.between(start, end);
        System.out.println(d);

        LocalDate current =  LocalDate.now();
        LocalDate past = LocalDate.of(1990, 12 , 30);

        Period p1 = Period.between(current, past);
        System.out.println(p1);
    }
}
