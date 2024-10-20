public class KnapSackTab {

    public static int KnapSackTabulation(int[] val, int[] wt, int W) {
        int n = val.length;

        int dp[][] = new int[n + 1][W + 1];

        // Initialize the dp array with 0 for 0th column and 0th row
        for (int i = 0; i <= n; i++) { // 0th column
            dp[i][0] = 0;
        }

        for (int j = 0; j <= W; j++) { // 0th row
            dp[0][j] = 0;
        }

        // Fill the dp array using the tabulation method
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= W; j++){
                int v = val[i-1]; // Value of the current item
                int w = wt[i-1]; // Weight of the current item

                if(w <= j){
                    int incProfit = v + dp[i-1][j-w]; // Include the item
                    int excProfit = dp[i-1][j]; // Exclude the item

                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    // Item can't be included
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = { 5, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };

        int W = 7;

        System.out.println(KnapSackTabulation(val, wt, W));
    }

}
