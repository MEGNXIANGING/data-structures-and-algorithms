package com.example.algorithm.datastructuresalgorithms.leetcode.slideWinsow;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-size-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 滑动窗口
 */
public class MinSubArrayLen {

    public static void main(String[] args) {
       int []nums= new int[]{2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        if (nums==null||nums.length==0){
            return 0;
        }
        int res=nums.length+1;
        int total=0;
        int i=0;
        int j=0;
        while (j<nums.length){
            total=total+nums[j];
            j++;
            while (total>=target){
                res=Math.min(res,j-i);
                total=total-nums[i];
                i++;
            }
        }
        if (res==nums.length+1){
            return 0;
        }
        return res;
    }
}
