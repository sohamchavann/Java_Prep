package DnC;
import java.util.*;

public class Q4_No_of_Ones {
    public static int firstOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                first = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return first;
    }
    public static void main(String[] args) {
        int arr[]  = {0,0,0,0,1,1,1,1};
        int ans = arr.length - firstOccurrence(arr, 7, 1);
        System.out.println("No of ones in array are : " +ans);
    }
}


