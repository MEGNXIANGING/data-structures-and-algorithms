package com.example.algorithm.datastructuresalgorithms.syy.arr;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (i < j && nums[i] != val) {
                i++;
            }
            while (i < j && nums[j] == val) {
                j--;
            }
            int tmp=nums[i];
            nums[i] = nums[j];
            nums[j] =tmp;
        }
        return nums[j] == val ? j : j+1;
    }
    public int removeElement1(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l=0;
        int r=nums.length-1;
        while(l<r){
            while(l<r && nums[l] !=val){
                l++;
            }
            while(l<r && nums[r] ==val){
                r--;
            }
            int temp=nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
        }
        return nums[r]==val?r:r+1;
    }
}
