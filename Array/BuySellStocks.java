package Array;

public class BuySellStocks {

    public static int BuySellStocks(int prices[]) {

        int buyPrice = prices[0]; // Initialize buyPrice to the first element
        int MaxProfit = 0;

        for (int i = 1; i < prices.length; i++) { // Start from the second element
            if (buyPrice > prices[i]) {
                buyPrice = prices[i]; // Update buyPrice
            } else {
                int profit = prices[i] - buyPrice;
                MaxProfit = Math.max(MaxProfit, profit);
            }
        }
        return MaxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(BuySellStocks(prices));
    }
}
