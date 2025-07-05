package Java8Features.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> s1 = s -> s.toLowerCase().charAt(0)=='s';
        Predicate<String> s2 = s -> s.toLowerCase().charAt(s.length()-1) == 'm';

        System.out.println(s1.test("Soham"));
        System.out.println(s1.negate().test("Soham"));// opposite o/p

        //and
        Predicate<String> and = s1.and(s2);
        System.out.println(and.test("Soham"));
        //Similarly for OR

        //is Equal
        Predicate<Object> predicate = Predicate.isEqual("Soham");
        System.out.println(predicate.test("Ssoham"));

    }
}
