package Java8Features.FunctionalInterfaces;

import java.util.*;
import java.util.function.Function;
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> f1 = s -> s.length(); //basic

        System.out.println(f1.apply("Soham"));

        Function<String, String> func2 = s -> s.substring(0,2);

        Function<List<Student>, List<Student>> StudAsMrAsPrefix = list -> {
            List<Student> result = new ArrayList<>();
            for (Student s : list) {
                if(func2.apply(s.getName()).equalsIgnoreCase("jr")){
                    result.add(s);
                }
            }
            return result;
        };

        Student s1 =  new Student("Jr Soham");
        Student s2 =  new Student("Jr Somu");
        Student s3 =  new Student("mrs Ssao");

        List<Student> students = Arrays.asList(s1, s2, s3);

        List<Student> Result = StudAsMrAsPrefix.apply(students);

        System.out.println(Result);
    }
    private static class Student{
      private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name +" ";
        }
    }
}
