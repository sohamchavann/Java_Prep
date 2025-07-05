package Java8Features.DateNTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        //LocalDate
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate customDate = LocalDate.of(2003, 10, 30);

        LocalDate yesterday = today.minusDays(1);

        if(today.isAfter(yesterday)){
            System.out.println("ypoo");

        //Local Time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime customTime = LocalTime.of(2,22,1);
        System.out.println(customTime);

        LocalTime parsedTime = LocalTime.parse("02:11:58");
        System.out.println(parsedTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);


        }
    }
}
