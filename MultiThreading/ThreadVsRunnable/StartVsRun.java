package MultiThreading.ThreadVsRunnable;

public class StartVsRun {
    static class MyThread extends Thread {
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }

    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        t1.run();   // 🚫 No new thread. Executes in main thread.
        t1.start(); // ✅ New thread. Executes in separate thread.
    }
}