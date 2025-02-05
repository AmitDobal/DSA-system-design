package com.amit.dsa.a1_array_string.b7_BuySellStock;

import java.util.ArrayList;
import java.util.List;

public class BuySellStock {
    /**
     * Calculates the maximum profit that can be achieved from buying and selling a stock.
     * The function assumes you can complete at most one transaction (i.e., buy one and sell one share of the stock).
     *
     * @param prices an array where the ith element is the price of a given stock on day i
     * @return the maximum profit that can be achieved
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];
        int size = prices.length;

        for (int i = 0; i < size; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minSoFar);
        }

        return maxProfit;
    }
}
