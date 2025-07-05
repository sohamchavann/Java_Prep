package OOPSBasicstoAdv.Properties.Polymorphism;

public class Numbers {
    void sum(int a, int b){
        System.out.println("sum of two");
    }
    void sum(int a, int b, int c){
        System.out.println("sum of three");
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(1,2);
        obj.sum(1,2,3);
//        obj.sum(1,2,3,4); //error
    }
}
