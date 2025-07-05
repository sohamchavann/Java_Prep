package Arrays;//print Arrays.subarrays, number of Arrays.subarrays, sum of Arrays.subarrays and min and max of sum of Arrays.subarrays.

public class SubarrayOptimized {
    public static void main(String[] args) {
        int arr[] = {1,-5,15,-8,-9};
        kandanes(arr);
    }
    public static void prefixSum(int[] arr){
        int CurrSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        for(int i =0;i<arr.length;i++){
            int start = i;

            for(int j = i;j<arr.length;j++){
                int end = j;
                if(start==0){
                    CurrSum = prefix[end];
                }else {
                    CurrSum = prefix[end] - prefix[start-1];
                }
                if(maxSum<CurrSum){
                    maxSum = CurrSum;
                }
                System.out.print(CurrSum +" ");
                }
            System.out.println();
            }
            System.out.println(maxSum);
        }
        public static void kandanes(int[] arr){
             int maxSum=Integer.MIN_VALUE;
             int currSum=0;

             for(int i=0;i<arr.length;i++) {
                 currSum = currSum + arr[i];
                 if (currSum>maxSum){
                     maxSum=currSum;
                 }
                 if(currSum<0){
                     currSum=0;
                 }
             }
            System.out.println("max subarray sum is : " +maxSum);
        }

    }
