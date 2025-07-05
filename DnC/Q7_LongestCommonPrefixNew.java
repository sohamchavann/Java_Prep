package DnC;

public class Q7_LongestCommonPrefixNew {
    // FunctionExample to find the longest common prefix using divide and conquer
    public static String longestCommonPrefix(String[] strs) {
        // If the input array is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start the divide and conquer approach
        return lcp(strs, 0, strs.length - 1);
    }
    // Helper function to find LCP between two indices of the string array
    private static String lcp(String[] strs, int left, int right) {
        // Base case: if the left and right are the same, return the string at that index
        if (left == right) {
            return strs[left];
        }

        // Find the middle index
        int mid = left + (right - left) / 2;
        // Recursively find the LCP in the left and right halves
        String leftLCP = lcp(strs, left, mid);
        String rightLCP = lcp(strs, mid + 1, right);

        // Return the common prefix of the two halves
        return commonPrefix(leftLCP, rightLCP);
    }
    // FunctionExample to find the common prefix between two strings
    private static String commonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }

        // If one string is a prefix of the other, return the shorter string
        return str1.substring(0, minLength);
    }
    public static void main(String[] args) {
        // Test case 1
        String[] strings1 = {"technique", "technician", "technology", "technical"};
        System.out.println("The longest common prefix is " +
                longestCommonPrefix(strings1)); // Output: techn

        // Test case 2
        String[] strings2 = {"techie delight", "tech", "techie", "technology", "technical"};
        System.out.println("The longest common prefix is " +
                longestCommonPrefix(strings2)); // Output: tech
    }
}