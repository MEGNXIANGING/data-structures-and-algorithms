package com.example.algorithm.datastructuresalgorithms.leetcode.problems;

/**
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: coins = [1, 2, 5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 * Example 2:
 * <p>
 * Input: coins = [2], amount = 3
 * Output: -1
 * Note:
 * You may assume that you have an infinite number of each kind of coin.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/coin-change
 *
 * @Author: apple
 * @Description： DP: 1、确定状态
 * 2、转移方程
 * 3、初始条件  边界情况
 * 4、计算顺序
 * <p>
 * f[x]=min{f[x-2]+1,f(x-5)+1,f[x-7]+1}
 * 这里的1是值（2、5、7）
 * @Date: 2020/3/8 下午10:14
 */
public class coinChange {

    public int coinChange(int[] A, int M) {
        //0......n [n+1]
        int[] f = new int[M + 1];
        //number of kinds of coins
        int n = A.length;
        //init 零枚硬币拼出0块钱
        f[0] = 0;

        for (int i = 1; i <= M; i++) {
            f[i] = Integer.MAX_VALUE;
            //last coin A[j]
            for (int j = 0; j < n; j++) {
                //边界校验
                if (i >= A[j] && f[i - A[j]] != Integer.MAX_VALUE) {
                    f[i] = Math.min(f[i - A[j]] + 1, f[i]);
                }
            }
        }
        if (f[M] ==Integer.MAX_VALUE){
            return -1;
        }
        return f[M];
    }


}
