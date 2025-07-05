package OOPSBasicstoAdv.ComparisonObjects;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
    String name;
    int marks;
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student o) {
        return this.marks - o.marks;
    }
    @Override
    public String toString() {
        return marks + "";
    }

    public static void main(String[] args) {
        Student s1 = new Student("Soham", 99);
        Student s2 = new Student("Saloni", 98);
        Student s3 = new Student("Bhavesh", 35);
        ArrayList<Student> list = new ArrayList<>();
        //System.out.println(s1.compareTo(s2));

        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list);
        System.out.println(list);
    }
}
