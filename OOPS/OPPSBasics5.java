//Abstraction
package OOPS;

public class OPPSBasics5 {
    public static void main(String[] args) {
        Indian T = new Indian();
    }
}
abstract class ANIMAL{
    ANIMAL(){
        System.out.println("Media Constructor Called");
    }
    void eats(){
        System.out.println("it eats");
    }
    abstract void walks();
}

class Hen extends ANIMAL{
    void walks(){
        System.out.println("it walks on 2 legs");
    }
}
class Tiger extends ANIMAL{
    Tiger(){
        System.out.println("Tiger Constructor Called");
    }
    void walks(){
        System.out.println("it walks on four legs");
    }

}
class Indian extends Tiger{
    Indian(){
        System.out.println("Indian Constructor Called");
    }
}

