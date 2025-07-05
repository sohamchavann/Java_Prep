package DnC;

public class Q3_SmallestMissing {

    public static int findSmallestMissing(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;  // The missing element is on the right side
            } else {
                right = mid - 1;  // The missing element is on the left side
            }
        }
        return left;
    }
    public static int findSmallestMissingB(int[] nums) {
        // Brute force approach
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 6, 9, 11, 15};
        System.out.println("The smallest missing element is " + findSmallestMissing(nums1));  // Output: 3

        int[] nums2 = {1, 2, 3, 4, 6, 9, 11, 15};
        System.out.println("The smallest missing element is " + findSmallestMissing(nums2));  // Output: 0

        int[] nums3 = {0, 1, 2, 3, 4, 5, 6};
        System.out.println("The smallest missing element is " + findSmallestMissing(nums3));  // Output: 7
    }
}
