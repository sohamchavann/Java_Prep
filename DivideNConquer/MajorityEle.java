//Given an array nums of size n, return the majority element.
// The majority element is defined as the element that appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always exists in the array.
package DivideNConquer;

import java.util.Arrays;

public class MajorityEle {
    public static int bruteforce(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>n/2){
                return arr[i];
            }
        }
        return -1;
    }
    public static int SortingApproach(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    public static int soln(int arr[], int si, int ei){//recursive approach
        if(si==ei){
            return arr[si];
        }

        int mid = (si+ei)/2;
        int leftmajorityele = soln(arr, si , mid);
        int rightmajorityele = soln(arr,mid+1,ei);

        if(leftmajorityele==rightmajorityele){
            return leftmajorityele;
        }

        int leftCount = countOccurences(arr,leftmajorityele,si,ei);
        int rightCount =countOccurences(arr,rightmajorityele,si,ei);
        return leftCount>rightCount ? leftmajorityele : rightmajorityele;
    }
    public static int countOccurences(int arr[], int key, int si, int ei){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        return count;
    }

    public static int moorealgo(int arr[]){//moore's voting algorithm
        int n = arr.length;
        int currEle = -1; // null
        int count = 0;
        for(int i = 0 ; i < n;i++){
            if(count==0){
                currEle = arr[i];
            }
            if (arr[i]==currEle){
                count++;
            }else{
                count--;
            }
        }
       // return currEle;
        //check if in question it is said that majority ele "might" be present in array not sure
        int cnt = 0;
        for(int i = 0; i<n;i++){
            if(arr[i]==currEle){
                cnt++;
            }
            if(cnt>n/2){
                return currEle;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,1,2,1,2};
        System.out.println(soln(arr, 0 , arr.length-1));
        System.out.println(moorealgo(arr));
    }
}
