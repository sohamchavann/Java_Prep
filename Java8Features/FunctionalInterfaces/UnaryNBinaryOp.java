package Java8Features.FunctionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryNBinaryOp {
    public static void main(String[] args) {
        // Both operators are used if all input and return
        // parameters are same in Function and BiFunc Interface

        UnaryOperator<Integer> f1 = s -> s*s;
        System.out.println(f1.apply(12));

        BinaryOperator<Integer> f2 = (x,y) -> x*y;
        System.out.println(f2.apply(2,3));
    }
}
