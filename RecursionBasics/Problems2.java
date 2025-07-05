//check if array is sorted or not
//wap to find 1st occurance of element in array
//wap to find last occurance of element in array
package RecursionBasics;

public class Problems2 {
    public static void main(String[] args) {
        int arr[] = {5,5,5,4,6,5};
       // System.out.println(isSorted(arr, 0));
        System.out.println(firstoccur(arr,5,0));
        System.out.println(lastoccur(arr,5,0));
        everyoccurrence(arr, 5 , 0);

    }
    public static boolean isSorted(int arr[], int i){
        int n = arr.length;
        if(i==n-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static int firstoccur(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return firstoccur(arr, key, i+1);
    }
    public static int lastoccur(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastoccur(arr,key,i+1);

        if(isFound==-1 && arr[i]==key){//uparwale ne -1 diya ab self check
            return i;
        }

        return isFound;
    }
    public static void everyoccurrence(int arr[], int key, int i){
        if(i==arr.length){
            return ;
        }
        if(arr[i]== key){
            System.out.print(i + " ");
        }
        everyoccurrence(arr, key, i+1);
    }
}
