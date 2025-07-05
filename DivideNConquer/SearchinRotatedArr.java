package DivideNConquer;

public class SearchinRotatedArr {
    //using recursion:
    public static int soln(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = (si + ei) / 2;
        //check mid first
        if (arr[mid] == tar) {
            return mid;
        }

        //check on line1
        if (arr[mid] >= arr[si]) {
            if (arr[si] <= tar && tar < arr[mid]) { //left of mid on line 1
               return soln(arr, tar, si, mid - 1);
            } else {
               return soln(arr, tar, mid + 1, ei); // right of mid
            }
        }

        //check on line2
       else if(arr[mid] <= arr[ei]) {
            if (arr[mid] < tar && tar <= ei) {
                return soln(arr, tar, mid + 1, ei);//check right of mid on line 2
            } else {
                return soln(arr, tar, si, mid - 1);//check left of mid
            }
        }
       return -1;
    }
    //using loops:
    public static int soln1(int arr[],int tar, int si , int ei){
        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid]==tar){
                return mid;
            }

            if(arr[si]<arr[mid]){
                if(arr[si]<=tar && tar<arr[mid]){
                    ei = mid-1;
                }
                else {
                    si = mid+1;
                }
            }
            else if(arr[mid]<=arr[ei])  {
                if(arr[mid]<tar && tar<=arr[ei]){
                    si = mid+1;
                }
                else{
                    ei = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main (String[]args){
        int arr[] = { 6, 8, 10, 0, 2, 4 };
        int taridx = soln(arr,8, 0, arr.length - 1);

        System.out.println(taridx);
    }
}
