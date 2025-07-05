package MultiThreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount{
    private int balance = 100;
    private final Lock lock = new ReentrantLock();
    public void withdraw(int amt){
        System.out.println("attempting to withdraw : "+Thread.currentThread().getName());
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance>=amt){
                    try {
                        System.out.println("processing withdrawal : " +Thread.currentThread().getName());
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }finally {
                        lock.unlock();
                    }
                    balance -= amt;
                    System.out.println("withdrawal successfull, remaining balance : " +balance);
                }
                else{
                    System.out.println("invalid withdrawal amount");
                }
            }else {
                System.out.println(Thread.currentThread().getName()+ " : Lock is busy");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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
