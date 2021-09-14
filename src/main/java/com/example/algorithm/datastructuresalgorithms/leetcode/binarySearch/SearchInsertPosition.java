package com.example.algorithm.datastructuresalgorithms.leetcode.binarySearch;

public class SearchInsertPosition {
    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * <p>
     * 请必须使用时间复杂度为 O(log n) 的算法。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-insert-position
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return 0;
        }

        int l = 0;
        int r = nums.length - 1;
        while (l <=r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                r = m-1;
            } else {
                l = m + 1;
            }
        }
        return r+1;
    }

    public int searchInsert2(int[] nums, int target) {
        if (nums == nums || nums.length < 1) {
            return 0;
        }
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

}
