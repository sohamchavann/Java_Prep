//Reversing the first K elements of a Queue
//We have an integer k and a queue of integers, we need to reverse the order of the first k
//elements of the queue, leaving the other elements in the same relative order.
//Sample Input 1 : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] ,k=5
//Sample Output 1 : Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100
//Auxiliary Space: O(k), Time Complexity: O(n + k)
package Queue;
import java.util.*;
public class Reverse1stKElements {
    public static void soln(Queue<Integer> q, int k){
        if (q.isEmpty() == true || k > q.size())
            return;
        if (k <= 0)
            return;

        int n = q.size();
        Stack<Integer> s = new Stack<>();
        for(int i =0;i<k;i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i = 0;i<n-k;i++){
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        soln(q,5);
    }
}
