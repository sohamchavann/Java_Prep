package GreedyAlgoritms;

import java.util.*;

public class MaxLengthChainPairs {
    public static void main(String[] args) {    //o(nlogn)
        int pairs[][] = {{5,4},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int lastPairEnd = pairs[0][1]; //last selected pair end// chain end

        for(int i = 1;i<pairs.length;i++){
            if(lastPairEnd<pairs[i][0]){
                chainLength++;
                lastPairEnd =  pairs[i][1];
            }
        }

        System.out.println("max length of chain : " +chainLength);
    }
}
