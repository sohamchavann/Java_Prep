package ExceptionHandling.Rough;

public class example {
    public static void main(String[] args) throws Exception{
        try{
            int a = 10/0;
            System.out.println(a);
        }catch(ArithmeticException e){
            throw new ArithmeticException();
        }finally{
            System.out.println("yo exception is handled");
        }
        example e1 = new example();
//        e1.throwsExample();
        e1.customEx();
    }
    public void throwsExample() throws Exception {
        throw new Exception();
    }
    public void customEx() throws customException{
        throw new customException("custom exception");
    }
}
class customException extends Exception{
    customException(String message){
        super(message);
    }
}
