package MultiThreading.ThreadVsRunnable;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedRunnable implements Runnable {
    static int count = 0;

    public synchronized void run() {
        for(int i =0; i<10000;i++){
            count++;
        }
    }

    public static void main(String[] args) {
        SharedRunnable task = new SharedRunnable();  // One shared object

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("count : " +count);
    }
}
