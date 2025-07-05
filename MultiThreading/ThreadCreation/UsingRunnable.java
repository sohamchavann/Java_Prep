package MultiThreading.ThreadCreation;

public class UsingRunnable implements Runnable{

    @Override
    public void run() {
            System.out.println("Thread Using Runnable");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            };
    }
}
