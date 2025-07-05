public class TrappingRainwater {
    public static void main(String[] args) {
        int nums[] = {4, 2, 0, 6, 3, 2, 5};
        solution(nums);
    }
    public static void solution(int[] nums) { //0(n)
        int leftbound[] = new int[nums.length];
        int rightbound[] = new int[nums.length];
        //int trappedwater[] = new int[nums.length];
        //int waterlvl[] = new int[nums.length];
        int waterlvl;
        int trappedwater;

        int trappedwatersum=0;
        leftbound[0] = nums[0];
        rightbound[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
//            if (leftbound[i - 1] > nums[i]) {
//                leftbound[i] = leftbound[i - 1];
//            } else {
//                leftbound[i] = nums[i];
//            }
            leftbound[i]=Math.max(nums[i],leftbound[i-1]);
        }
        for (int i = nums.length - 2; i >= 0; i--) {
//            if (rightbound[i + 1] > nums[i]) {
//                rightbound[i] = rightbound[i + 1];
//            } else {
//                rightbound[i] = nums[i];
//            }
            rightbound[i] = Math.max(nums[i],rightbound[i+1]);
        }
        for (int i=0;i<nums.length;i++){
            waterlvl=Math.min(leftbound[i],rightbound[i]);
            trappedwater=waterlvl-nums[i];

            trappedwatersum = trappedwatersum+trappedwater;
        }

        System.out.println("Trapped Water is : " +trappedwatersum);
    }
}
