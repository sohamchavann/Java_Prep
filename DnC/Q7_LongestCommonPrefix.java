package DnC;

import java.util.Arrays;

public class Q7_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        // Sort the array
        Arrays.sort(strs);
        // Get the first and last strings
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        // Start comparing
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i])
                break;
            result.append(first[i]);
        }
        return result.toString();
    }
    public static String findLCP(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return divideAndConquer(strs, 0, strs.length - 1);
    }
    private static String divideAndConquer(String[] strs, int left, int right) {
        if (left == right) return strs[left];

        int mid = (left + right) / 2;
        String lcpLeft = divideAndConquer(strs, left, mid);
        String lcpRight = divideAndConquer(strs, mid + 1, right);
        return commonPrefix(lcpLeft, lcpRight);
    }
    private static String commonPrefix(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return s1.substring(0, i);
        }
        return s1.substring(0, minLength);
    }
    public static void main(String[] args) {
        // Test case 1
        String[] strings1 = {"technique", "technician", "technology", "technical"};
        System.out.println("The longest common prefix is " +
                longestCommonPrefix(strings1)); // Output: techn
    }
}