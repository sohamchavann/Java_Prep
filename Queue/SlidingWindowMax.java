//Maximum of all subarrays of size k
//We have an array arr[] of size N and an integer K. Find the maximum for each and every
//contiguous subarray of size K.
//Sample Input 1 : N=9, K=3 arr= 1 2 3 1 4 5 2 3 6
//Sample Output 1 : 3 3 4 5 5 5 6

package Queue;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
    public static ArrayList<Integer> bruteforce(int arr[], int k) {
        //TC: O(n*k) , SC: O(n)
        ArrayList<Integer> list = new ArrayList<>();  // Stores the maximum of each window

        // Iterate through all possible starting points of subarrays of size k
        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];  // Initialize max as the first element of the current window

            // Iterate through the next (k-1) elements in the window
            for (int j = i; j <= i+k-1; j++) {
                max = Math.max(max, arr[j]);
            }
            list.add(max);  // Store the max value for this window
        }
        return list;
    }

    public static ArrayList<Integer> maxSlidingWindow(int[] arr, int k) {
        //t.c : o(n), s.c : o(n+k)
        ArrayList<Integer> result = new ArrayList<>(); // Stores max values of each window
        Deque<Integer> deque = new LinkedList<>(); // Stores indices of elements

        for (int i = 0; i < arr.length; i++) {

            // Remove elements from the front if they are out of the window
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back as they are useless
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            // Add the current element index at the back
            deque.addLast(i);

            // Store the maximum when the first window is completed (i >= k - 1)
            if (i >= k - 1) {
                result.add(arr[deque.peekFirst()]); // Front of deque is the max element
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,7,1,6};  // Sample input array
        int k = 3;  // Size of sliding window

        // Call brute-force method and print the result
        System.out.println(bruteforce(arr, k));
        System.out.println(maxSlidingWindow(arr, k));
    }
}

