package com.example.algorithm.datastructuresalgorithms.leetcode.binarySearch;

public class findPeakElement {
    /**
     * 峰值元素是指其值严格大于左右相邻值的元素。
     *
     * 给你一个整数数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
     *
     * 你可以假设 nums[-1] = nums[n] = -∞ 。
     *
     * 你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-peak-element
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * o(log n) 时间复杂度的算法只有二分
     * m > m+1  峰值在m的左边
     * m < m+1 峰值在m+1的右边
     * @param nums
     * @return
     */
    public int findPeakElement(int[] nums) {
        if (nums==null||nums.length==0){
            return -1;
        }
        int left=0;
        int right=nums.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if (nums[mid]>=nums[mid+1]){
                right=mid;
            }else {
                left=mid+1;
            }
        }
        return left;
    }
}
