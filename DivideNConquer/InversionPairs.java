package DivideNConquer;

public class InversionPairs {
    public static void main(String[] args) {
        int arr[] = {5,3,2,4,1};
        printArr(arr);
        System.out.println(mergeSort(arr,0,arr.length-1));
    }
    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int mergeSort(int arr[], int si, int ei){
        int cnt = 0;
        if(si>=ei){      //base
            return cnt;
        }
        int mid = si + (ei-si)/2; //(si+ei)/2
        cnt = mergeSort(arr, si, mid);
        cnt += mergeSort(arr, mid+1, ei);
        cnt += merge(arr, si , mid, ei);
        return cnt ;
    }
    public static int merge(int arr[],int si, int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;//iterator for left part
        int j = mid+1;//iterator for right part
        int k  = 0;//iterator for temp ar
        int cnt = 0;// r
        while(i<=mid&&j<=ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                cnt += mid-i+1;
                k++;
                j++;
            }
        }
        //remaining left part if any
        while(i<=mid){
            temp[k] = arr[i];
            k++; i++;
        }
        //remianing right part if any
        while(j<=ei){
            temp[k] = arr[j];
            k++; j++;
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
        return cnt;
    }
}
