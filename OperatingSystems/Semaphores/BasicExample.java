package OperatingSystems.Semaphores;

import java.util.concurrent.Semaphore;

public class BasicExample {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1); // Only one thread allowed at a time

        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Thread 1: Waiting for permit");
                sem.acquire();
                System.out.println("Thread 1: Got permit");
                Thread.sleep(2000); // Simulate work
                sem.release();
                System.out.println("Thread 1: Released permit");
            } catch (InterruptedException e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                System.out.println("Thread 2: Waiting for permit");
                sem.acquire();
                System.out.println("Thread 2: Got permit");
                Thread.sleep(1000); // Simulate work
                sem.release();
                System.out.println("Thread 2: Released permit");
            } catch (InterruptedException e) {}
        });

        t1.start();
        t2.start();
    }
}
