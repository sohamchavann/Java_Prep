package Java8Features.FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Soham", "Saloni", "Sonu");
        students.forEach(x -> System.out.println(x));

        //Replace Lamda func
        students.forEach(MethodRef::print);
    }
    public static void print(String s){
        System.out.println(s);
    }
}
