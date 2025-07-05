package RecursionBasics;

import static DivideNConquer.MergeSort.merge;

public class rough {
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8,0};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pivotidx = partition(arr,si,ei);
        mergeSort(arr, si, pivotidx-1);
        mergeSort(arr,pivotidx+1, ei);

    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        arr[ei]=arr[i];
        arr[i]=pivot;
        return i;
    }
}