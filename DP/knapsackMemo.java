public class knapsackMemo {

    public static int knapsack(int[] val, int[] wt, int w, int n, int dp[][]) {

        if (w == 0 || n == 0) {
            return 0;
        }

        if (dp[n][w] != -1) {
            return dp[n][w];
        }

        if (wt[n-1] <= w) { 
            int include = val[n-1] + knapsack(val, wt, w-wt[n-1], n-1, dp);
            int exclude = knapsack(val, wt, w, n-1, dp);
            dp[n][w] = Math.max(include, exclude);
            return dp[n][w];

        } else { 
            dp[n][w] = knapsack(val, wt, w, n-1, dp);
            return dp[n][w];
        }
    }

    public static void main(String[] args) {
        
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[]  = { 2, 5, 1, 3, 4 };
        int w = 7;
        int n = val.length;

        int dp[][] = new int[n+1][w+1];

        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(knapsack(val, wt, w, n, dp));
    }
}
