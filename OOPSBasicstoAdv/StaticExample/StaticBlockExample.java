package OOPSBasicstoAdv.StaticExample;

public class StaticBlockExample {
    static {
        System.out.println("Static Block executed");
    }
    public static void main(String[] args) {
//        StaticBlock obj = new StaticBlock();
        //no need of object creation as StaticBlockExample
        //Class is first thing loaded in memory

        System.out.println("Vectors method Loaded");

        soham S = new soham();
        //requires object creation to load class soham in memory
        //static block will not execute without object creation
    }
}
class soham{
    static{
        System.out.println("Static block of soham");
        // will only run once, when the first obj is create i.e.
        // when the class is loaded for the first time
    }
}