package OOPSBasicstoAdv.Properties.Inheritance;

public class temp {
    public static void main(String[] args) {
        parent o1 = new child("Bhavesh", "Soham");
        o1.show(7);
//        o1.display();
    }
}
 class parent{
    void display(){
        System.out.println("display");
    }
      void show(int a){
        System.out.println("parent : " +a);
    }
     parent(String pname){
        System.out.println("parent : " +pname );
    }
}
class child extends parent{
      void show(int a){
         System.out.println("Child");
    }
    void display1(){
        System.out.println("Child Display");
    }
    child(String cname, String pname){
        super(pname);
        System.out.println("child : " +cname);
        //super(pname); //eror
    }

}
