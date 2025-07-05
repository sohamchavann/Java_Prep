package Java8Features.DateNTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedTimeExample {
    public static void main(String[] args) {
        ZonedDateTime indiaTime =  ZonedDateTime.now();
        System.out.println(indiaTime);

        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println(newYorkTime);
    }
}
