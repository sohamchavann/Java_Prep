package MultiThreading.ThreadCreation;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Test t1 = new Test();

        UsingRunnable t2 = new UsingRunnable();
        Thread t22 = new Thread(t2);

        t1.start();
        System.out.println(t1.getState());
        t22.start();
        System.out.println(t22.getState());

        Thread.sleep(1000);
        System.out.println(t22.getState());
        System.out.println(t1.getState());


        t1.join();
        t22.join();

        System.out.println(Thread.currentThread().getState());
        System.out.println("Finished");

//        Runnable r1 = () -> {
//            for(int i =0;i<10;i++){
//                System.out.println("Thread is running");
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//        Thread t1 = new Thread(() -> System.out.println("Thread is running"));
//        t1.start();
    }
}
