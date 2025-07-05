import java.util.*;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i] =  sc.nextInt();             
        }
        Arrays.sort(arr);     
        System.out.println("Enter Element to Find");
        int key = sc.nextInt();
        int ans = binarysearch(arr, key);
        
        if (ans==-1) {
            System.out.println("Element is not present in array");            
        }else{
            System.out.println("Element is present at index "+ans);
        }
        System.out.println(soln(arr,key,0,arr.length-1));
    } 
    public static int binarysearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        
        while (start<=end) {
            int mid = (start+end)/2;

            if (key==arr[mid]) {
                return mid;
            }

        if (arr[mid]>key) {
            end = mid-1;
        }
        if(arr[mid]<key){
            start = mid+1;
        }            
        }
    return -1;
    }
    //using recursion:
    public static int soln(int arr[],int key, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid = (si+ei)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[si]<=key && key<arr[mid]){
            return soln(arr,key,si,mid-1);
        }
        else if(arr[mid]<key && key<=arr[ei] ){
            return soln(arr,key,mid+1,ei);
        }
        return -1;
    }

}
