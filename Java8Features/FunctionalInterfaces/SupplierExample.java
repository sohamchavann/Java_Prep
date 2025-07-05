package Java8Features.FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> 1;

        //here integer is return type

        System.out.println(s.get());
    }
}
