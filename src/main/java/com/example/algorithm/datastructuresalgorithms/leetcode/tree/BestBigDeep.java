package com.example.algorithm.datastructuresalgorithms.leetcode.tree;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/21 下午5:08
 */
public class BestBigDeep {


      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

    public static void main(String[] args) {

    }
    public int findRepeatNumber(int[] nums) {
        int[] temp=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
            if (temp[nums[i]]>1){
                return i;
            }
        }
        return -1;


    }

}
