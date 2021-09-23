package com.example.algorithm.datastructuresalgorithms.leetcode.dp;

public class Fib {
    public static int fib(int n) {
        if (n<=2){
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <dp.length ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(5));;
    }
}
