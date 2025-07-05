package OOPSBasicstoAdv.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human soham = new Human(21, "Soham", 10000, false);
        Human saloni = new Human(21, "Saloni", 10000, true);

        System.out.println(soham.population);
        System.out.println(saloni.population);

        //greeting(); WILL NOT RUN

        Main funn = new Main();
        funn.fun2();
    }
    static void fun() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
//        fun();
        System.out.println("Hello world");
    }
}
