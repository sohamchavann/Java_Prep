package DnC;

import java.util.*;
public class Q6_KClosest {
    // FunctionExample to find k closest elements to target
    public static List<Integer> findClosestElements(int[] arr, int k, int target) {
        // Step 1: Binary search to find the closest element
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        // Now, left points to the position of the closest element
        left = left - 1;
        // Step 2: Use two pointers to find the closest k elements
        int i = left, j = left + 1;
        List<Integer> result = new ArrayList<>();
        while (k-- > 0) {
            if (i < 0) {
                result.add(arr[j++]);
            } else if (j >= arr.length) {
                result.add(arr[i--]);
            } else {
                // Compare which element is closer to the target
                if (Math.abs(arr[i] - target) <= Math.abs(arr[j] - target)) {
                    result.add(arr[i--]);
                } else {
                    result.add(arr[j++]);
                }
            }
        }
        // Return the result
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 12, 15, 17, 18, 20, 25};
        int k1 = 4, target1 = 16;
        System.out.println(findClosestElements(arr1, k1, target1)); // Output: [12, 15, 17,18]
    }
}