package LeatCodeStreak;

import java.sql.SQLOutput;

public class SellStockWithMaxProfit {

    public static void main(String args[]){
        SellStockWithMaxProfit obj = new SellStockWithMaxProfit();
        int[] prices = {2,4,1};
        int result = obj.maxProfit(prices);
        System.out.println("Result - "+result);

    }

    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (price < buyPrice) {
                buyPrice = price;
            } else {
                // Calculate profit if the current price is greater than the buy price
                int profit = price - buyPrice;
                // Update maxProfit if the new profit is higher
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }


        }
        return maxProfit;
    }
}
