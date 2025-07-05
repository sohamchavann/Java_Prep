package Java8Features.DateNTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Formatter {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        Date today = Date.parse("2023/10/21", DateTimeFormatter);
        String t = today.format(formatter);
        System.out.println(t);


        String date = "2023/06/22";
        LocalDate parse = LocalDate.parse(date, formatter);
        System.out.println(parse);
    }
}
