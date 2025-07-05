// for given n lines on xaxis use 2 lines to form a conatiner such that it holds max water

package ArrayList;

import java.util.*;

public class ContainerWithMostWater {
    public static int storedWater(ArrayList<Integer> ht){//BruteForce : o(n2)
        int maxWaterStored = Integer.MIN_VALUE;
        for (int i=0; i<ht.size();i++){
            for (int j=i+1;j<ht.size();j++){
                int width = j-i;
                int heightW = Math.min(ht.get(i), ht.get(j));
                int currWater = heightW*width;
                maxWaterStored = Math.max(maxWaterStored, currWater);
            }
        }
        return maxWaterStored;
    }

    //two pointers approach : O(n)
    public static int storedWater1(ArrayList<Integer> ht){
        int maxWaterStored = 0;
        int i = 0;
        int j = ht.size()-1;
        while(j>i){
            int width = j-i;
            int height = Math.min(ht.get(i), ht.get(j));
            int currWater =width*height;
            maxWaterStored = Math.max(maxWaterStored, currWater);
            if(ht.get(i)>=ht.get(j)){
                j--;
            }else i++;
        }
        return maxWaterStored;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storedWater1(height));
    }
}
