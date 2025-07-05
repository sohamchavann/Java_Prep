//You are given an integer arraylist nums. A number x is lonely when it appears only once, and
//no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
//Return all lonely numbers in nums. You may return the answer in any order
package ArrayList;
import java.util.*;
public class lonely {
    public ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i < nums.size()-1; i++) {
            if (nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1))
            {
                list.add(nums.get(i));
            }
        }
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)) {
                        list.add(nums.get(nums.size()-1));
            }
        }
        return list;
    }
    public static void main(String[] args) {

    }
}
