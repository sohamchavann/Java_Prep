public class printpairs {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        algo(arr);
    }
    public static void algo(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length-1;i++){
            int curr = arr[i];

            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" +curr + "," + arr[j] +")"  );
                tp++;
            }
            System.out.println();

        }
        System.out.println(tp);
    }
}
