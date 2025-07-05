//Interfaces
public class OPPSBasics6 {
    public static void main(String[] args) {
        Human soham = new Human();
        soham.eatsVeg();
        soham.eatsNonVeg();
    }
}
interface Veg{
    void eatsVeg();
}

interface NonVeg{
    void eatsNonVeg();
}

class Human implements Veg, NonVeg{
    public void eatsVeg(){
        System.out.println("eats Veg");
    }
    public void eatsNonVeg(){
        System.out.println("eats Non Veg");
    }
}
