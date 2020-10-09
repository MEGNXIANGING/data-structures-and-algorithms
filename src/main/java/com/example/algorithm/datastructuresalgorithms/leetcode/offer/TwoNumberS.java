package com.example.algorithm.datastructuresalgorithms.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: apple
 * @Description:
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 * @Date: 2020/10/9 下午9:45
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 */
public class TwoNumberS {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <nums.length-1 ; i++) {
            int m=nums[i];
            for (int j = i+1; j <nums.length ; j++) {
                int n=nums[j];
                if (m+n==target){
                  return   new int[]{nums[i],nums[j]};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i:nums){
            if (map.containsKey(target-i)){
                return new int[]{target-i,i};
            }else {
                map.put(i,0);
            }
        }
        return new int[0];
    }

    public int[] twoSum3(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while (left<=right){
            int cur=nums[left]+nums[right];
            if (cur==target){
                return new int[]{nums[left],nums[right]};
            }
            if (cur>target){
                right--;
            }else {
                left++;
            }
        }
        return new int[0];
    }
}
