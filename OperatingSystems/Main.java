package OperatingSystems;

public class Main {

    public static void taskA() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000); // 1 second
                System.out.printf("TaskA: %d%n", i);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void taskB() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000); // 1 second
                System.out.printf("TaskB: %d%n", i);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> taskA());
        Thread t2 = new Thread(() -> taskB());

        t1.start(); // Start taskA
        t2.start(); // Start taskB

        try {
            t1.join(); // Wait for t1 to finish
            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Both tasks completed.");
    }
}
