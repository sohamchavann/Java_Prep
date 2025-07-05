public class arraysquestions {
    public static void main(String[] args) {
        int arr[] = {1, -2 , 3 ,0, 2, 1};
        System.out.println(duplicatecheck(arr));
    }
    public static boolean duplicatecheck(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
}
