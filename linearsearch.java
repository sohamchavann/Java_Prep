import java.util.*;

public class linearsearch{
    public static void main(String[] args) {
        int arr[] =  {2,3,1,9,5,7};
        int key = 7;
        int index = algo(arr,key);

        System.out.println("index is : "+index);
    }
    public static int algo(int arr[], int key){
        for(int i =0;i<arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}