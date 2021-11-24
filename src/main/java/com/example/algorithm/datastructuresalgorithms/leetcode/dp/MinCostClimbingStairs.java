package com.example.algorithm.datastructuresalgorithms.leetcode.dp;

/**
 * 数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值 cost[i]（下标从 0 开始）。
 *
 * 每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
 *
 * 请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-cost-climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int [] cost=new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int i = minCostClimbingStairs(cost);
        System.out.println(i);
    }
    public static int minCostClimbingStairs(int[] cost) {
        if(cost==null || cost.length==0){
            return 0;
        }
        int dp[]=new int[cost.length];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<cost.length;i++){
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}
