package Arrays;//print Arrays.subarrays, number of Arrays.subarrays, sum of Arrays.subarrays and min and max of sum of Arrays.subarrays.

public class subarrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printSubarray(arr);
    }
    public static void printSubarray(int[] arr){
        int ts =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            int start = i;

            for(int j = i;j<arr.length;j++){
                int end = j;
                int sum = 0;
                for(int k = start;k<=end;k++ ){
                    System.out.print(arr[k] + " ");//print Arrays.subarrays
                     sum = sum+arr[k];
                }
                if(sum>max){
                    max = sum;
                }
                if(sum<min){
                    min = sum;
                }
                ts++;
                System.out.println(" Sum of subarray : "  +sum);
                System.out.println();
            }

            System.out.println();
        }
        System.out.println("Max : " +max);
        System.out.println("Min : " +min);

        System.out.println("total Arrays.subarrays : " +ts);
    }
}
