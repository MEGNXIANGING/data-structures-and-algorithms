package com.example.algorithm.datastructuresalgorithms.leetcode.dp;

public class uniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            if (m==0){
                return 0;
            }
            int n=obstacleGrid[0].length;
            if (n==0){
                return 0;
            }
            int[][] f = new int[m][n];
            for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
                f[i][0] = 1;
            }
            for (int j = 0; j < n && obstacleGrid[0][j] == 0; j++) {
                f[0][j] = 1;
            }

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (obstacleGrid[i][j] == 0) {
                        f[i][j] = f[i - 1][j] + f[i][j - 1];
                    }
                }
            }
            return f[m-1][n-1];
    }


    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }

        // 定义 dp 数组并初始化第 1 行和第 1 列。
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n && obstacleGrid[0][j] == 0; j++) {
            dp[0][j] = 1;
        }

        // 根据状态转移方程 dp[i][j] = dp[i - 1][j] + dp[i][j - 1] 进行递推。
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

}
