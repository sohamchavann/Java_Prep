package OOPSBasicstoAdv.StaticExample;


public class StaticBlock {
    // will only run once, when the first obj is create i.e.
    // when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
    }
    public static void main(String[] args) {
//        StaticBlock obj = new StaticBlock();
        //no need of object creation as StaticBlock
        //Class is first loaded in memory
        soham S = new soham();
        //requires object creation to load class
        // soham in memory
        //static block will not exceute without object creation
    }
}
