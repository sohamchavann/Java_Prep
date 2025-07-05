//Connect n ropes with minimum cost
//Given an array arr[] of rope lengths,
// connect all ropes into a single rope with the minimum total cost.
// The cost to connect two ropes is the sum of their lengths.
package Queue;

import java.util.PriorityQueue;

public class ConnectNRows {
    public static int soln(int arr[]){
        //priority queue
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int totalSum = 0;//intiallize variable

        //add elements from arr to q
        for(int num : arr){
            q.add(num);
        }

        //While size of priority queue is more than 1
        while(q.size()>1){
            // Extract shortest two ropes from pq
            int first = q.poll();
            int second = q.poll();

            // Connect the ropes: update result and
            // insert the new rope to pq
            totalSum = totalSum + first + second;
            q.add(first+second);
        }
        return totalSum;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,6};
        System.out.println(soln(arr));
    }
}
