package MultiThreading.ThreadMethods;

public class Interrupt extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is Running");
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println("Exception : " +e);;
        }
    }
    public static void main(String[] args) {
        Interrupt t1  = new Interrupt();
        t1.start();
        t1.interrupt();
    }
}
