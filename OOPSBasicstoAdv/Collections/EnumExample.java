package OOPSBasicstoAdv.Collections;
import java.util.Arrays;
public class EnumExample {
    public static enum Day{
        MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY;
    }
    public static void main(String[] args) {
        test t1 = new test(Day.THURSDAY);
        t1.greetDay();
    }
}
class test{
   EnumExample.Day day;
    public test(EnumExample.Day day){
        this.day = day;
    }
    public void greetDay(){
        switch(day){
            case MONDAY -> System.out.println("Monday is Good");
            case FRIDAY -> System.out.println("Weekend is near");
            default -> System.out.println("midweek day");
        }
    }
}

