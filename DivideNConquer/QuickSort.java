package DivideNConquer;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of arr");
        int arr[] = new int[sc.nextInt()];
        System.out.println("enter elements");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //int arr[] = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[],int si, int ei){
        if (si>=ei){
            return;
        }
        //last element
        int pivotindex = partition(arr, si, ei);
        quickSort(arr, si, pivotindex-1);//left part
        quickSort(arr, pivotindex+1, ei);//right part
    }
    public static int partition(int arr[],int si, int ei){
        int pivot = arr[ei];
        int i= si-1; //to make place for ele smaller than pivot
        for(int j = si; j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void quickSortRandom(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int randomIndex = new Random().nextInt(ei - si + 1) + si;
        int temp = arr[randomIndex];
        arr[randomIndex] = arr[ei];
        arr[ei] = temp;

        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, ei);
    }

}