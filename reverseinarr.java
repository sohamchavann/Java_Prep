public class reverseinarr {
    public static void main(String[] args) {
        int nums[]= {3,35,23,21,13};
       swap(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
    //fast approach
    public static void swap(int nums[]){
        int first = 0;
        int last = nums.length-1;

        while(first<last){
            int temp = nums[last];
            nums[last]=nums[first];
            nums[first] = temp;

            first++;
            last--;
        }
    }

//Slow Approach
//      public static void swap(int[] nums){
//               int temp[] = new int[nums.length];
//               for(int i =0;i<nums.length;i++){
//                   temp[i]= nums[nums.length-i-1];
//            }
//               for(int i =0;i<nums.length;i++){
//                   nums[i] = temp[i];
//        }
//      }
}
