//An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
//An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
//Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
//Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise
package ArrayList;
import java.util.*;
public class findMonotonic {
    public static boolean soln(ArrayList<Integer> list){
        boolean isDec = true;
        boolean isInc = true;
        for(int i = 0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                isInc = false;
            } else if (list.get(i)< list.get(i+1)) {
                isDec =false;
            }
        }
        return isInc || isDec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println( soln(list));
    }
}
