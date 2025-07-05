//max subarray with zero sum
package Hashing;

import java.util.HashMap;

public class SubArraySumZero {
    public static void main(String[] args) {
        int arr[] = {9, -3, 3, -1, 6, -5};
        System.out.println(bruteforce(arr)) ;
        System.out.println(optimal(arr)) ;
    }
    public static int optimal(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;
        for(int j = 0; j < arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len, j - map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        return len;
    }
    public static int bruteforce(int arr[]) {
        int maxcnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    maxcnt = Math.max(maxcnt, j - i + 1); // Update the maximum length when sum is 0
                }
            }
        }
        return maxcnt;
    }
}
