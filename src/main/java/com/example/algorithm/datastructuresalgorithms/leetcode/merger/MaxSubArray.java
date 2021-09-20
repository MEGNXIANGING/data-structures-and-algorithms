package com.example.algorithm.datastructuresalgorithms.leetcode.merger;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 *
 *
 * 归并排序，先左边  再右边再中间
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        return getMaxSub(nums,0,nums.length-1);
    }

    private int getMaxSub(int[] nums, int left, int right) {
        if (left==right){
            return nums[left];
        }
        int mid=left+(right-left)/2;
        //左边
        int leftMax = getMaxSub(nums, left, mid);
        //右边
        int rightMax = getMaxSub(nums, mid + 1, right);
        int crossMax = getCrossMax(nums,left,right);
        int max = Math.max(leftMax, rightMax);
        return Math.max(max, crossMax);
    }

    private int getCrossMax(int[] nums, int left, int right) {
        int mid=left+(right-left)/2;
        int leftSum = nums[mid];
        int leftMax=leftSum;
        for (int i = mid-1; i >=left ; i--) {
            leftSum+=nums[i];
            leftMax=Math.max(leftMax,leftSum);
        }
        int rightSum=nums[mid+1];
        int rightMax=rightSum;
        for (int i = mid+2; i <=right ; i++) {
            rightSum+=nums[i];
            rightMax=Math.max(rightSum,rightMax);
        }
        return rightMax+leftMax;
    }



    private int crossSum(int[] nums, int l, int r) {
        int mid = l + (r-l)/2;
        // from mid to leftmost
        int leftSum = nums[mid];
        int leftMax = leftSum;
        for (int i = mid - 1; i >= l; i--) {
            leftSum += nums[i];
            leftMax = Math.max(leftMax, leftSum);
        }

        // from mid+1 to rightmost
        int rightSum = nums[mid+1];
        int rightMax = rightSum;
        for (int i = mid + 2; i <= r; i++) {
            rightSum += nums[i];
            rightMax = Math.max(rightMax, rightSum);
        }

        return leftMax + rightMax;
    }


    public int maxSubArray2(int[] nums) {
        int size=nums.length-1;
        int max=0;
        for (int i = 1; i <=size ; i++) {
            if (nums[i-1]>0){
                nums[i]+=nums[i+1];
            }
            max=Math.max(nums[i],max);
        }
        return max;
    }
}
