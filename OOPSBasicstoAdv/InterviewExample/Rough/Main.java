package OOPSBasicstoAdv.InterviewExample.Rough;

public class Main {
    public static void main(String[] args) throws Exception {
        Payment t1 = new UPI(100);
        t1.makePayment();
    }
}
abstract class Payment{
    private int amount;

    Payment(int amount) throws Exception {
        setAmount(amount);
    }
    void setAmount(int amount) throws Exception {
        if(amount>0){
            this.amount = amount;
        }else throw new Exception("Enter vaild amount");
    }
    int getAmount(){
        return this.amount;
    }

    abstract void makePayment();

    abstract String payementMethod();
}
class UPI extends Payment{

    UPI(int amount) throws Exception {
        super(amount);
    }
    @Override
    void makePayment() {
        System.out.println("Upi payemnt of " +getAmount() + " Successful");
    }

    @Override
    String payementMethod() {
        return "UPI";
    }
}
