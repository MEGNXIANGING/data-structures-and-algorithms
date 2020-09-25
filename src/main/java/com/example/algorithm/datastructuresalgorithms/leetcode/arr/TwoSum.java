package com.example.algorithm.datastructuresalgorithms.leetcode.arr;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: apple
 * @Description:
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order
 * @Date: 2020/9/25 下午11:13
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int r=target-nums[i];
            if (map.containsKey(r)){
                return new int[] {map.get(r),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
