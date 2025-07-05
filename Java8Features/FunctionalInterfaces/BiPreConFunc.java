package Java8Features.FunctionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPreConFunc {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> p = (x, y) -> x==y;
        System.out.println(p.test(2,2));

        BiConsumer<Integer, Integer> c = (x , y) -> System.out.println(x+y);
        c.accept(2,4);

        BiFunction<Integer, Integer, String> f = (x,y) -> {
            if(x % y == 0 || y % x == 0 || (x==1 || y==1)){
                return "Factor";
            }
            return "Not Factor";
        };

        System.out.println(f.apply(421,2));
    }
}
