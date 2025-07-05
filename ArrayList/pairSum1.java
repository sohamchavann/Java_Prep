//find any pair in sorted arraylist has target sum
package ArrayList;

import java.util.ArrayList;

public class pairSum1 {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        for(int i=0;i<list.size();i++){
            for(int j =i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        int LP = 0;
        int RP = list.size()-1;

        while(RP>LP){
            if (list.get(LP) + list.get(RP) == target){
                return true;
            } else if (list.get(LP) + list.get(RP)<target) {
                LP++;
            }else{
                RP--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        System.out.println( pairSum1(height, 434));
    }
}
