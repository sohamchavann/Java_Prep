//Maximum Subarray Sum using Divide and Conquer
//Given an integer array, find the maximum sum among all subarrays possible.
//The problem differs from the problem of finding the maximum subsequence sum. Unlike
//subsequences, subarrays are required to occupy consecutive positions within the original
//array
//For example,
//Input: nums[] = [2, -4, 1, 9, -6, 7, -3]
//Output: The maximum sum of the subarray is 11
package DnC;


public class Q9_MaxSubArraySum {
    // FunctionExample to find the maximum sum of subarray crossing the middle
    public static int findMaxCrossingSubarray(int[] nums, int low, int mid, int high) {
        // Left half
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= low; i--) {
            sum += nums[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }
        // Right half
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= high; i++) {
            sum += nums[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }
        return leftSum + rightSum; // Combine
    }
    // Recursive function to find the maximum sum subarray
    public static int findMaxSubarray(int[] nums, int low, int high) {
        if (low == high) {
            return nums[low]; // Base case: Only one element
        } else {
            int mid = (low + high) / 2;
            // Find the maximum subarray sum in the left half, right half, and crossing
            //middle
            int leftSum = findMaxSubarray(nums, low, mid);
            int rightSum = findMaxSubarray(nums, mid + 1, high);
            int crossSum = findMaxCrossingSubarray(nums, low, mid, high);
            return Math.max(Math.max(leftSum, rightSum), crossSum); // Return the best
           // of three
        }
    }
    public static void main(String[] args) {
        int[] nums = {2, -4, 1, 9, -6, 7, -3};
        // Find the maximum sum subarray
        int result = findMaxSubarray(nums, 0, nums.length - 1);
        System.out.println("The maximum sum of the subarray is " + result); // Output: 11
    }
}