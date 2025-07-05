package MultiThreading.Synchronization;

public class BankAccount{
    private int balance = 100;
    public synchronized void withdraw(int amt){
        System.out.println("attempting to withdraw : "+Thread.currentThread().getName());
        if(balance>=amt){
            System.out.println("processing withdrawal : " +Thread.currentThread().getName());
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        balance -= amt;
        System.out.println("withdrawal successfull, remaining balance : " +balance);
    }

    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "thread 1");
        Thread t2 = new Thread(task, "thread 2");

        t1.start();
        t2.start();
    }
}
