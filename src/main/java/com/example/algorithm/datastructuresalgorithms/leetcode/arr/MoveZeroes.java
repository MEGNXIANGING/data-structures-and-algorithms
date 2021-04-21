package com.example.algorithm.datastructuresalgorithms.leetcode.arr;

/**
 * @Author: apple
 * @Description: 移动的零
 * @Date: 2021/4/21 下午9:26
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] ar={0,0,1};
        moveZeroes(ar);
    }
    public static void moveZeroes(int[] nums) {
        if (nums.length==1){
            return;
        }
        int index=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        for (int i = index; i <nums.length ; i++) {
            nums[i]=0;
        }
    }
}
