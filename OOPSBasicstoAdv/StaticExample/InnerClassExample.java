package OOPSBasicstoAdv.StaticExample;

public class InnerClassExample {
    static class Inner{
        int data;
        Inner(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Inner i = new Inner(32);
        // valid: beacuse now Inner class is
        // static, so we do not have to
        // create object of outer class
    }
}
