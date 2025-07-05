//find any pair in sorted and rotated arraylist has target sum
package ArrayList;

import java.util.ArrayList;

public class pairsum2 {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int n = list.size();
        int breakingpt = -1;
        for(int i = 0; i< list.size();i++){
            if(list.get(i)>list.get(i+1)){
                breakingpt = i;
                break;
            }
        }
        int RP = breakingpt; //right pointer
        int LP = breakingpt+1;
        while(RP!=LP){
            if(list.get(RP) + list.get(LP) == target){
                return true;
            } else if(list.get(RP) + list.get(LP) < target){
                LP = (LP+1)%n;
            } else if (list.get(RP) + list.get(LP) > target) {
                RP = (list.size()+RP-1)%n;
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        System.out.println( pairSum(height, 26));
    }
}
