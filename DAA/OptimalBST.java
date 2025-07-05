package DAA;
//OptimalBST
public class OptimalBST {
    // Utility function to sum frequencies from i to j
    public static int sum(int[] freq, int i, int j) {
        int total = 0;
        for (int k = i; k <= j; k++) {
            total += freq[k];
        }
        return total;
    }

    // Memoization approach (Top-Down)
    public static int optimalBSTMemo(int[] freq, int i, int j, int[][] dp) {
        if (i > j) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        dp[i][j] = Integer.MAX_VALUE;

        for (int r = i; r <= j; r++) {
            int costLeft = optimalBSTMemo(freq, i, r - 1, dp);
            int costRight = optimalBSTMemo(freq, r + 1, j, dp);
            int totalFreq = sum(freq, i, j);
            int cost = costLeft + costRight + totalFreq;
            dp[i][j] = Math.min(dp[i][j], cost);
        }

        return dp[i][j];
    }

    // Tabulation approach (Bottom-Up)
    public static int optimalBSTTabulation(int[] freq) {
        int n = freq.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = freq[i];  // single node tree
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                int totalFreq = sum(freq, i, j);

                for (int r = i; r <= j; r++) {
                    int costLeft = (r > i) ? dp[i][r - 1] : 0;
                    int costRight = (r < j) ? dp[r + 1][j] : 0;
                    int cost = costLeft + costRight + totalFreq;
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        int[] keys = {10, 20, 30, 40, 50, 60, 70};
        int[] freq = {4, 2, 6, 3, 5, 1, 2};
        int n = freq.length;

        // Memoization
        int[][] dpMemo = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dpMemo[i][j] = -1;
            }
        }
        int resultMemo = optimalBSTMemo(freq, 0, n - 1, dpMemo);
        System.out.println("Minimum cost (Memoization): " + resultMemo);

        // Tabulation
        int resultTab = optimalBSTTabulation(freq);
        System.out.println("Minimum cost (Tabulation): " + resultTab);
    }
}