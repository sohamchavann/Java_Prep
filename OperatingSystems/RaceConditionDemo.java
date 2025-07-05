package OperatingSystems;

public class RaceConditionDemo {
    static int count = 0;

    public static void task() {
        for (int i = 0; i < 1_000_000; i++) {
            count++; // Not synchronized - race condition here
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> task());
        Thread t2 = new Thread(() -> task());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final Count: " + count);
    }
}
