package MultiThreading.ThreadMethods;

public class priority extends Thread{
    public priority(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread is Running......");
        for(int i =0;i<5;i++){
            System.out.println(Thread.currentThread().getName() +" " +Thread.currentThread().getPriority() + " Is Running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        priority t1 =new priority("T1");
        priority t2 =new priority("T2");
        priority t3 =new priority("T3");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
