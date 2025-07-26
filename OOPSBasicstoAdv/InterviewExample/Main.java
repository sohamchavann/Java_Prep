package OOPSBasicstoAdv.InterviewExample;

public class Main {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment(500.0);
        processPayment(p1);

        Payment p2 = new CreditCardPayment(1200.0);
        processPayment(p2);

        Payment p3 = new NetBankingPayment(2000.0);
        processPayment(p3);
    }
    static void processPayment(Payment payment) {
        System.out.println("---------------");
        System.out.println("Payment Method: " + payment.paymentMethod());
        payment.makePayment();  // Polymorphic behavior
    }
}
abstract class Payment {
    // 2. Encapsulation: private fields
    private double amount;

    // Constructor
    public Payment(double amount) {
        setAmount(amount);
    }

    // Encapsulated accessors
    public void setAmount(double amount) {
        if (amount > 0) this.amount = amount;
        else System.out.println("Invalid amount.");
    }

    public double getAmount() {
        return amount;
    }

    // Abstract methods (to be implemented by subclasses)
    abstract void makePayment();
    abstract String paymentMethod();
}





class UpiPayment extends Payment {
    public UpiPayment(double amount) {
        super(amount);
    }
    @Override
    void makePayment() {
        System.out.println("UPI Payment of ₹" + getAmount() + " completed. Transaction ID: ");
    }

    @Override
    String paymentMethod() {
        return "UPI";
    }
}

class CreditCardPayment extends Payment {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Credit Card Payment of ₹" + getAmount() + " successful. Transaction ID: " );
    }

    @Override
    String paymentMethod() {
        return "Credit Card";
    }
}

class NetBankingPayment extends Payment {
    public NetBankingPayment(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Net Banking Payment of ₹" + getAmount() + " done. Transaction ID: ");
    }

    @Override
    String paymentMethod() {
        return "Net Banking";
    }
}

