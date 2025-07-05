package DnC;

import java.util.*;
public class Q5_PairsWithDiffK {
    public static void findPairsWithDifference(int[] arr, int k) {
        // Sort the array using a divide-and-conquer approach
        quickSort(arr, 0, arr.length - 1);
        // Use two pointers to find pairs
        int i = 0, j = 1;
        while (j < arr.length) {
            int diff = arr[j] - arr[i];
            if (diff == k) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                i++;
                j++;
            } else if (diff < k) {
                j++; // Increase the right pointer
            } else {
                i++; // Increase the left pointer
                // Ensure i doesn't surpass j
                if (i == j) {
                    j++;
                }
            }
        }
    }

    // QuickSort algorithm for divide and conquer sorting
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1); // Sort left of pivot
            quickSort(arr, pivotIndex + 1, high); // Sort right of pivot
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1; // Index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void findPairWithDifferenceOptimal(int[] arr, int k) {
        // HashSet to store unique elements
        Set<Integer> set = new HashSet<>();
        System.out.println("Pairs with difference " + k + ":");

        for (int num : arr) {
            // Check if num + k is already in the set
            if (set.contains(num + k)) {
                System.out.println("(" + num + ", " + (num + k) + ")");
            }
            // Check if num - k is already in the set
            if (set.contains(num - k)) {
                System.out.println("(" + (num - k) + ", " + num + ")");
            }
            // Add the current number to the set
            set.add(num);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 2, 2, 5, 5, 4};
        int k = 3;
        System.out.println("Pairs with difference " + k + ":");
        findPairsWithDifference(arr, k);
        findPairWithDifferenceOptimal(arr, k);
    }
}