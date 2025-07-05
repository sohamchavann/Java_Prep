package OOPSBasicstoAdv.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // Runtime exception
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        } finally {
            System.out.println("Always runs (finally block)");
        }

        Test t = new Test();
        try{
            t.validate(11);
        }catch (Exception e){
            System.out.println("Exxception : " +e );
        }
        try{
            t.check(false);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
class Test{
    void validate(int age) throws IllegalArgumentException{
        if(age<18){
            throw new IllegalArgumentException("IllegalArgumentException");
        }
    }
    void check(boolean check) throws MyException{
        if(check == false){
            throw new MyException("custom exception");
        }
    }
}
