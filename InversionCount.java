//Count Inversions in Array
//Given an integer array arr[] of size n, find the inversion count in the array.
// Two array elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

public class InversionCount {
    public static int bruteforce(int arr[]){
        int cnt = 0;
        for(int i = 0 ; i< arr.length-1;i++){
            for (int j = i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(bruteforce(arr));
    }
}
