package OOPSBasicstoAdv.InnerClassAndLamdaExpressions;

public abstract class Example {
    void show(){
        System.out.println("I am in outer class");
    }
    abstract void create();
    static class InnerClass{
        void display(){
            System.out.println("i am in inner class");
        }
    }
    public static void main(String[] args) {
        Example e = new Example(){
            void create(){
                System.out.println("Anonymous Inner Class");
            }
        };
        e.create();
        e.show();

       InnerClass i = new InnerClass();
       i.display();
    }
}
