package DnC;
//InversionCount
public class Q1_InvPairs {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int cnt = mergeSort(arr,0,arr.length-1);
        System.out.println(cnt);
    }
    public static int mergeSort(int arr[], int si, int ei){
        int cnt =0;
        if(si>=ei){
            return cnt;
        }
        int mid = (si+ei)/2;
        cnt = mergeSort(arr, si, mid);
        cnt += mergeSort(arr, mid+1, ei);
        cnt += merge(arr, si, ei, mid);
        return cnt;
    }
    public static int merge(int arr[], int si, int ei, int mid){
        int i = si;
        int j = mid+1;
        int temp[] = new int[ei-si+1];
        int k = 0;
        int cnt = 0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                cnt += mid-i+1;
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(i = si, k = 0;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
        return cnt;
    }
}
