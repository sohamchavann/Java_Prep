
import java.util.Scanner;
import java.util.Arrays;

public class SearchMethods {
    
    // Method for linear search
    public static int linearSearch(int[] arr, int x) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the element at index 'i' matches the search element 'x'
            if (arr[i] == x) {
                return i; // Return the index if element found
            }
        }
        return -1; // Return -1 if element not found
    }
    
    // Method for binary search
    public static int binarySearch(int[] arr, int x) {
        Arrays.sort(arr); // Sort the array (Binary search requires a sorted array)
        int low = 0;
        int high = arr.length - 1;
        // Perform binary search
        while (low <= high) {
            int mid = (low + high) / 2;
            // Check if the middle element is the search element 'x'
            if (arr[mid] == x) {
                return mid; // Return the index if element found
            } else if (arr[mid] < x) {
                low = mid + 1; // If 'x' is greater, search the right half
            } else {
                high = mid - 1; // If 'x' is smaller, search the left half
            }
        }
        return -1; // Return -1 if element not found
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        // Menu for user selection
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Perform Linear Search");
            System.out.println("2. Perform Binary Search");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to search: ");
                    int searchElementLinear = scanner.nextInt();
                    // Perform linear search and display result
                    int linearResult = linearSearch(array, searchElementLinear);
                    if (linearResult != -1) {
                        System.out.println("Element found at index " + linearResult);
                    } else {
                        System.out.println("Element not found in the array");
                    }
                    break;
                case 2:
                    System.out.print("Enter the element to search: ");
                    int searchElementBinary = scanner.nextInt();
                    // Perform binary search and display result
                    int binaryResult = binarySearch(array, searchElementBinary);
                    if (binaryResult != -1) {
                        System.out.println("Element found at index " + binaryResult);
                    } else {
                        System.out.println("Element not found in the array");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
