package OperatingSystems.Semaphores;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ProducerConsumer {

    static final int BUFFER_SIZE = 5;
    static Queue<Integer> buffer = new LinkedList<>();

    // Semaphores
    static Semaphore mutex = new Semaphore(1);         // For mutual exclusion
    static Semaphore empty = new Semaphore(BUFFER_SIZE); // Count of empty slots
    static Semaphore full = new Semaphore(0);          // Count of filled slots

    // Producer Thread
    static class Producer extends Thread {
        public void run() {
            int value = 0;
            try {
                while (true) {
                    empty.acquire();     // Wait if buffer is full
                    mutex.acquire();     // Enter critical section

                    buffer.add(value);
                    System.out.println("Produced: " + value);
                    value++;

                    mutex.release();     // Exit critical section
                    full.release();      // Signal that buffer is not empty

                    Thread.sleep(1000);  // Simulate production time
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Consumer Thread
    static class Consumer extends Thread {
        public void run() {
            try {
                while (true) {

                    full.acquire();      // Wait if buffer is empty
                    mutex.acquire();     // Enter critical section

                    int val = buffer.poll();
                    System.out.println("Consumed: " + val);

                    mutex.release();     // Exit critical section
                    empty.release();     // Signal that buffer is not full

                    Thread.sleep(1500);  // Simulate consumption time
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // CreateFile method
    public static void main(String[] args) {
        Producer p = new Producer();
        Consumer c = new Consumer();

        p.start();
        c.start();
    }
}
