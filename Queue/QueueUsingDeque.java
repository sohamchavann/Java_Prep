package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    static class Queue{
        static Deque<Integer> d = new LinkedList<>();
        static void add(int data){
            d.addLast(data);
        }
        static int remove(){
            return d.removeFirst();
        }
        static int peek(){
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue s = new Queue();
        s.add(1);
        s.add(2);
        s.add(3);

        System.out.println("peek = " + s.peek());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
    }
}
