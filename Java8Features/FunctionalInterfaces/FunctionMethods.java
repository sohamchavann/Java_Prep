package Java8Features.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionMethods {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = x -> x*2;
        Function<Integer, Integer> f2 = x -> x * x;

        System.out.println(f1.andThen(f2).apply(3));
        System.out.println(f2.andThen(f1).apply(3));//and then

        System.out.println(f1.compose(f2).apply(3));//compose

        Function<String, String> identityFunc = Function.identity();

        System.out.println(identityFunc.apply("Soshjd"));// identit func gives same op as ip

    }
}
