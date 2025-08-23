package Comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(21, "Soham");
        Student s2 = new Student(2, "Pranay");
        Student s3 = new Student(12, "Bhavesh");

        ArrayList<Student> list =  new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
//        AgeCompare a = new AgeCompare();
        Collections.sort(list, (a, b) -> a.age- b.age);

        for(Student s : list){
            System.out.println(s);
        }
    }
}
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // sort by name
    }
}
class AgeCompare implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s2.age - s1.age;
    }
}
class Student {
    int age;
    String name;

    Student(int age, String name){
        this.age= age;
        this.name = name;
    }

//    @Override
//    public int compareTo(Student s1) {
//        return this.age - s1.age;
//    }

    @Override
    public String toString() {
        return this.age + " " +this.name;
    }

}
