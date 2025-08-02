package MultiThreading.Rough;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        t1 thread1 = new t1();
        System.out.println(thread1.getState());
        thread1.start();
        System.out.println(thread1.getState());

        Thread.sleep(1000);
        System.out.println(thread1.getState());

        thread1.join();
        System.out.println(Thread.currentThread().getState());
    }
}

