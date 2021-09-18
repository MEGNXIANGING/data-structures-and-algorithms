package com.example.algorithm.datastructuresalgorithms.leetcode.merger;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : nums) {
            if (map.containsKey(item)) {
                Integer count = map.get(item);
                if (count + 1 >= n) {
                    return item;
                } else {
                    map.put(item, count + 1);
                }
            } else {
                map.put(item, 0);
            }
        }
        return nums[0];
    }

    /**
     * 分治算法
     *       大问题
     *    小    小   小
     *    解决  解决  解决
     *        最终答案
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {
        return getMajority(nums, 0, nums.length - 1);

    }

    private int getMajority(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int mid = left + (right - left) / 2;
        int leftMajority = getMajority(nums, left, mid);
        int rightMajority = getMajority(nums, mid + 1, right);
        if (leftMajority == rightMajority) {
            return leftMajority;
        }
        int leftCount = 0;
        int rightCount = 0;
        for (int item : nums) {
            if (item == leftMajority) leftCount++;
            else if (item == rightMajority) rightCount++;
        }
        if (leftCount>rightCount){
            return leftMajority;
        }else {
            return rightMajority;
        }
    }
}
