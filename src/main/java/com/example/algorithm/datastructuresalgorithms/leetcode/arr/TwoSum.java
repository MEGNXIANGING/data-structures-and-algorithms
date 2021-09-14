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
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            int r=target-nums[i];
            if(map.containsKey(r)){
                return new int[] {map.get(r),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }

    public int[] twoSum3(int[] nums, int target) {
        quickSort(nums,0,nums.length-1);
        int l=0;
        int r=nums.length-1;
        while (l<r){
           int temp= nums[l]+nums[r];
            if (temp>target){
                r--;
            }else if (temp<target){
                l++;
            }else {
                return new int[]{l,r};
            }
        }
        return new int[]{};
    }

    public void quickSort(int[] arr,int left,int right){
        if (left>=right){
            return;
        }
        int l=left;
        int r=right;
        int temp=arr[l];
        while (l<r){
            while (l<r&& arr[r]>= temp){
                r--;
            }
            if (l<r){
                arr[l]=arr[r];
            }
            while (l<r&& arr[l]< temp){
                l++;
            }
            if (l<r){
                arr[r]=arr[l];
            }
        }
        arr[l]=temp;
        quickSort(arr,left,l);
        quickSort(arr,r+1,right);
    }
}
