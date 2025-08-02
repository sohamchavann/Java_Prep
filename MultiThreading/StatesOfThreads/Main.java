package MultiThreading.StatesOfThreads;

public class Main {
    class myThread extends Thread{
        @Override
        public void run() {
            System.out.println("Thread is Running");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getState());
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();

        try {
            System.out.println(Thread.currentThread().getState());
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
