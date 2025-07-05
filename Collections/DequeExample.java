package Collections;
import java.util.*;
public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.add(1);
        dq.add(2);
        dq.add(3);

        dq.remove();
        System.out.println(dq);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(23);
        pq.add(44);
        pq.add(11);
        pq.add(2);
        pq.add(231);

        pq.remove();
        System.out.println(pq);
    }
}
