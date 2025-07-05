package DnC;

import java.util.*;

public class Q8_FindFreq {
    public static void findFre(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
                map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
    }
    public static void findFrequencies(int[] arr) {
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int current = arr[i];
            int first = findFirstOccurrence(arr, current, i, n - 1);
            int last = findLastOccurrence(arr, current, i, n - 1);
            freqMap.put(current, last - first + 1);
            i = last + 1; // Jump to next unique element
        }
        System.out.println(freqMap);
    }
    // Binary search for first occurrence
    private static int findFirstOccurrence(int[] arr, int target, int low, int high) {
        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                res = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    // Binary search for last occurrence
    private static int findLastOccurrence(int[] arr, int target, int low, int high) {
        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                res = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 4, 4, 4, 5, 5, 6, 8, 8, 9};
        findFre(arr);
        findFrequencies(arr);
    }
}
