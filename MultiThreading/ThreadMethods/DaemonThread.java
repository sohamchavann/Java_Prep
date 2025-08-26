package MultiThreading.ThreadMethods;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello world! ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        DaemonThread myThread = new DaemonThread();
//        myThread.setDaemon(true); // myThread is daemon thread ( like Garbage collector ) now
        DaemonThread t1 = new DaemonThread();
        t1.setDaemon(true);
        t1.start(); // t1 is user thread
        myThread.start();
        System.out.println("Vectors Done");
    }
}