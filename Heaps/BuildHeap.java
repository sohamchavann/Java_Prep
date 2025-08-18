package Heaps;

public class BuildHeap {

    // Build Min-Heap
    public static void buildMinHeap(int[] arr) {
        int n = arr.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            downHeapMin(arr, n, i);
        }
    }

    // DownHeap for Min-Heap
    private static void downHeapMin(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(arr, i, smallest);
            downHeapMin(arr, n, smallest);
        }
    }
    // Build Max-Heap
    public static void buildMaxHeap(int[] arr) {
        int n = arr.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            downHeapMax(arr, n, i);
        }
    }

    // DownHeap for Max-Heap
    private static void downHeapMax(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            downHeapMax(arr, n, largest);
        }
    }

    // Swap helper
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Utility to print array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 1, 4, 5};

        // Build Min-Heap
        buildMinHeap(arr);
        System.out.print("Min-Heap: ");
        printArray(arr);

        // Build Max-Heap
        int[] arr2 = {3, 9, 2, 1, 4, 5};
        buildMaxHeap(arr2);
        System.out.print("Max-Heap: ");
        printArray(arr2);
    }
}
