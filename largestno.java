////take array as input and find largest and smallest no. from the same
//
//import java.util.*;
//
//public class largestno {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Size of Array");
//        int size = sc.nextInt();
//        int arr[] =new int[size];
//        System.out.println("Enter Elements of Array");
//        for(int i = 0; i<size;i++){
//            int newNo = sc.nextInt();
//            arr[i] = newNo;
//        }
//
//        int largest = algoL(arr);
//        System.out.println("Largest Number is "+largest);
//        int smallest = algoS(arr);
//        System.out.println("Smallest Number is "+smallest);
//    }
//
//    public static int algoL(int arr[]) {
//        int largest = Integer.MIN_VALUE;
//        for(int i = 0;i<arr.length;i++){
//            if (arr[i] > largest) {
//                largest = arr[i];
//            }
//        }return largest;
//    }
//    public static int algoS(int arr[]){
//        int smallest = Integer.MAX_VALUE;
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i]< smallest){
//                smallest = arr[i];
//            }
//        }return smallest;
//    }
//}
//take array as input and find largest and smallest no. from the same

import java.util.*;

public class largestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements of Array");
        for (int i = 0; i < size; i++) {
           arr[i] = sc.nextInt();
        }
        int largest = algoL(arr);
        System.out.println("largest ele is : "+largest);
    }

    public static int algoL(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
return largest;
    }

}