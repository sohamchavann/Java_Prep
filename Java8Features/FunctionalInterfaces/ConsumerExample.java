package Java8Features.FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Soham");

        Consumer<String> c2 = s -> System.out.println(s + " Hero");

        c1.andThen(c2).accept("Soham");//andThen
    }
}
