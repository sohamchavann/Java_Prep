package OOPSBasicstoAdv.InnerClassAndLamdaExpressions;

public class LamdaExpressionWithReturn {
    public static void main(String[] args) {

        Sum i = (a, b) -> a+b;
        i.display();
        System.out.println(i.sum(5, 6));
    }
}
@java.lang.FunctionalInterface
interface Sum{
    int sum(int a, int b);
    default void display(){
        System.out.println("hello");
    }
}
