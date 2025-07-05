package OOPS;

import org.w3c.dom.ls.LSOutput;
//PolyMorophism
//Method Overloading

public class OPPSBasics4 {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(3,4));
        System.out.println(c1.sum(3.5,4.2));
        System.out.println(c1.sum(2,6,1));
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    double sum(double a, double b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
