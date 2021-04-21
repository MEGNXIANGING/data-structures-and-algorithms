package com.example.algorithm.datastructuresalgorithms.leetcode.arr;

import java.util.ArrayList;

/**
 * @Author: apple
 * @Description: 最大连续1的个数
 * @Date: 2021/4/21 下午9:06
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] ints = {1,0,1,1,0,1};
        System.out.println( findMaxConsecutiveOnes1(ints));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
            ArrayList<Integer> list= new ArrayList<>();
            int max=0;
            for(Integer i:nums){
                if(i==1){
                    list.add(i);
                }else {
                    max=Math.max(list.size(),max);
                    list=new ArrayList<>();
                }
            }
            return Math.max(list.size(),max);

    }

    public static int findMaxConsecutiveOnes1(int[] nums) {
        int max=0;
        int count=0;
        for(Integer i:nums){
            if (i==1){
                count++;
            }else {
                max=Math.max(count,max);
                count=0;
            }
        }
       return Math.max(count,max);
    }
}
