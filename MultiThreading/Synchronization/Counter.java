package MultiThreading.Synchronization;

public class Counter {
    private int counter;
    public synchronized void increment(){
        counter++;

//        synchronized (this){
//         counter++;
//        }
    }
    int getCounter(){
        return counter;
    }
}
