package OOPSBasicstoAdv;

public class Basics1 {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        Student s1 = new Student(23, "soham", 8.4f);
        Student random = new Student(s1);

//        System.out.println(s1.rno +" " +s1.name +" " +s1.marks + " " );
//        s1.rno = 23;
//        s1.name = "Soham";
//        s1.marks = 8.36f;
//        System.out.println(s1.rno +" " +s1.name +" " +s1.marks + " " );
//        System.out.println(s1.name);
//        System.out.println(s1.rno);
//        System.out.println(s1.marks);

        System.out.println(random.name);
        System.out.println(random.rno);
        System.out.println(random.marks);
    }
     public static class Student{
        int rno;
        String name;
        float marks;

        Student(int rno, String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
        Student(){
            System.out.println("i am random");
        }
        Student(Student other){
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }
    }
}
