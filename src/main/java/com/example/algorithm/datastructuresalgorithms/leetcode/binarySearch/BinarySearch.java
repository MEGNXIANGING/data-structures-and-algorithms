package com.example.algorithm.datastructuresalgorithms.leetcode.binarySearch;

public class BinarySearch {
    public int search(int[] nums, int target) {
        if (nums.length<1){
            return -1;
        }
        int l=0;
        int r=nums.length-1;
        while (l<=r){
            int m=l+(r-l)/2;
            if (nums[m]==target){
                return m;
            }else if (nums[m]<target){
                l=m+1;
            }else {
                r=m-1;
            }
        }
        return -1;
    }
}
