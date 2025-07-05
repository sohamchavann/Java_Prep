package Stack;

import java.util.Stack;

public class maxAreainHistogram {
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int n = arr.length;
        int nextSL[] = new int[n];
        int nextSR[] = new int[n];

        Stack<Integer> s = new Stack<>();

        //next smaller left: o(n)
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }if (s.isEmpty()){
                nextSL[i] = -1;
            }else {
                nextSL[i] = s.peek();
                }
            s.push(i);
            }

        //next smaller right: o(n)
        s = new Stack<>();
        for(int i = n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }if (s.isEmpty()){
                nextSR[i] = n;
            }else {
                nextSR[i] = s.peek();
            }
            s.push(i);
        }

        //current area: width : j-i-1 = a
        for(int i = 0; i< arr.length;i++){
            int height = arr[i];
            int width = nextSR[i] - nextSL[i] - 1;
            int currArea  = height*width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("max area in histogram: " + maxArea);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3}; //heights in histogram
        maxArea(arr);
    }
}
