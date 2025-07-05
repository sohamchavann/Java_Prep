package Sorting;

import java.util.*;
public class BubbleSort {
    public static void BubbleSort(int arr[]){
        int n = arr.length;
        boolean swapped=false;
        for(int i = 0; i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] =  arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,1,3,1,2};
        BubbleSort(arr);
    }
}
