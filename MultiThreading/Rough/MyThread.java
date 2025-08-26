package MultiThreading.Rough;
//
//public class MyThread extends Thread{
//    @Override
//    public void run() {
//        System.out.println("RUNNING"); // RUNNING
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread();
//        System.out.println(t1.getState()); // NEW
//        t1.start();
//        System.out.println(t1.getState()); // RUNNABLE
//        Thread.sleep(100);
//        System.out.println(t1.getState()); // TIMED_WAITING
//        t1.join();
//        System.out.println(t1.getState()); // TERMINATED
//
//    }
//}
public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello world! ");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.setDaemon(true); // myThread is daemon thread ( like Garbage collector ) now
//        MyThread t1 = new MyThread();
//        t1.start(); // t1 is user thread
        myThread.start();
        System.out.println("Main Done");
    }
}