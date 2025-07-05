package GreedyAlgoritms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int cntofCoins = 0;
        int amt = 1059;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i =0;i<coins.length;i++){
                while(coins[i]<=amt){
                    cntofCoins++;
                    ans.add(coins[i]);
                    amt -= coins[i];
            }
        }

        System.out.println("total cnt is : " +cntofCoins +"coins are  " +ans );
    }
}
