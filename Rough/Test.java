package Rough;

class A {
    static void show() {
        System.out.println("A's static show()");
    }
}

class B extends A {

    static void show() {
        System.out.println("B's static show()");
    }
}

public class Test {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        A obj3 = new B();  // polymorphism? Not with static methods!

        obj1.show();  // A's static show()
        obj2.show();  // B's static show()
        obj3.show();  // A's static show() — because static method depends on reference type, not object
    }
}
