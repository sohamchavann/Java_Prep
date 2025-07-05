package MultiThreading.ThreadCreation;

public class Test extends Thread {
    @Override
    public void run() {
            System.out.println("Thread Using Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}
