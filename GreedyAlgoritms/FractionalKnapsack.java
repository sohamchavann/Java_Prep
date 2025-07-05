package GreedyAlgoritms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int wt[] = {8, 2, 10, 1, 9, 7, 2, 6, 4, 9};
        int value[] = {10, 1, 7, 7, 5, 1, 8, 6, 8, 7};
        int n = value.length;
        int W = 21;

        double ratio[][] = new double[n][2];
        // 0th column -> index, 1st column -> value-to-weight ratio
        for (int i = 0; i < n; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) value[i] / wt[i]; // Ensure floating-point division
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        double capacity = W;
        double ans = 0;

        // Iterate in reverse order (descending by value/weight ratio)
        for (int i = n - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];

            if (capacity >= wt[idx]) {
                // Take full item
                capacity -= wt[idx];
                ans += value[idx];
            } else {
                // Take fraction of the item
                ans += ratio[i][1] * capacity;
                capacity = 0;
                break; // Knapsack is full
            }
        }
        System.out.println(ans);
    }
}
