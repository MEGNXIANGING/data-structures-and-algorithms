package com.example.algorithm.datastructuresalgorithms.leetcode.dp;

/**
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxProfit {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            for (int n = i - 1; n >= 0; n--) {
                int temp = prices[i] - prices[n];
                max = Math.max(temp, max);
            }
        }
        return max;
    }

    public static int maxProfit2(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int max = 0;
        int min=prices[0];
        for (int i = 1; i < prices.length; i++) {
            max=Math.max(prices[i]-min,max);
            min=Math.min(prices[i],min);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int i = maxProfit2(prices);
        System.out.println(i);

    }
}
