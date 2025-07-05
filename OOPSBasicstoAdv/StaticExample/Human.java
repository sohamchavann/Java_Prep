package OOPSBasicstoAdv.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
       // System.out.println(this.age);// this will not run, cant use this over here
    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.married = married;
        Human.population += 1;
    }
}
