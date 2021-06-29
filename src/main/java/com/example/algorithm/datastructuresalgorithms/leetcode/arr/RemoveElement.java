package com.example.algorithm.datastructuresalgorithms.leetcode.arr;

/**
 * @Author: apple
 * @Description: 移除元素
 * 27. 移除元素
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    /**
     * 双指针[3,2,2,3] 3
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement1(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l<r){
            while (l<r && nums[l]!=val){
                //获取左边第一个为val的值
                l++;
            }
            while (l<r && nums[r]==val){
                //获取右边第一个不为val的值
                r--;
            }
            //交换
            int temp=nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
        }
        //判断l所在位置，如果==val  不需要+1，反之需要+1
        return nums[l] ==val?l:l+1;
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,2,3,0,4,2};
        removeElement1(arr,2);
    }
}
