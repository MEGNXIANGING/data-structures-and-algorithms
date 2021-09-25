package com.example.algorithm.datastructuresalgorithms.leetcode.dp;

public class CoinChange {
    public int coinChange(int[] A, int M) {
        int []f=new int[M+1];
        int n=A.length; //number kinds of coins

        f[0]=0;
        for (int i = 1; i <=M ; i++) {
            f[i]=Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (i>=A[j] && f[i-A[j]]!=Integer.MAX_VALUE)//边界判断
                f[i]= Math.min(f[i-A[j]]+1,f[i]);
            }
        }
        return f[M]==Integer.MAX_VALUE?-1:f[M];
    }
}
