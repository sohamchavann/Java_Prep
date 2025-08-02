package MultiThreading.Rough;

class t2 implements Runnable {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println("Hello from Runnable");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
