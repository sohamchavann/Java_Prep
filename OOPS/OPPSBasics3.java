//Inheritance
package OOPS;

public class OPPSBasics3 {
    public static void main(String[] args) {
        Parrot tota = new Parrot();
        tota.talks();
        tota.eats();
    }
}
class Animal{
    void eats(){
        System.out.println("It Eats");
    }
    void breathes(){
        System.out.println("It Breathes");
    }
}
class Mammal extends Animal{
    void walks(){
        System.out.println("It Walks");
    }
}
class Monkey extends Mammal{
    void climbs(){
        System.out.println("It Climbs");
    }
}
//class HumaN extends Mammal{
//    void talks(){
//        System.out.println("It Talks");
//    }
//}
class Bird extends Animal{
    void flys(){
        System.out.println("It Flys");
    }
}
class Parrot extends Bird{
    void talks(){
        System.out.println("It Talks");
    }
}
