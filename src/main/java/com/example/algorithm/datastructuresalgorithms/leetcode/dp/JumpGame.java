package com.example.algorithm.datastructuresalgorithms.leetcode.dp;

public class JumpGame {
    /**
     * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
     * <p>
     * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
     * <p>
     * 判断你是否能够到达最后一个下标。
     */
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] f = new boolean[n];
        f[0] = true;
        for (int j = 1; j < n; j++) {
            f[j] = false;
            for (int i = 0; i < j; i++) {
                //最后一个位置，可以跳到i，然后i+nums[i]>=j
                if (f[i] && i + nums[i] >= j) {
                    f[j] = true;
                }
            }
        }
        return f[n-1];
    }
}
