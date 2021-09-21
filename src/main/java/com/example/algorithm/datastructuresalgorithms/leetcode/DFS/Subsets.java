package com.example.algorithm.datastructuresalgorithms.leetcode.DFS;


import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums,result,0,new ArrayList<>());
        return result;
    }

    private static void dfs(int[] nums, List<List<Integer>> result, int index, List<Integer> list) {
        List<Integer> l2 = new ArrayList<>();
        l2.addAll(list);
        result.add(l2);
        if (index==nums.length){
            return;
        }
        for (int i = index; i <nums.length; i++) {
            list.add(nums[i]);
            dfs(nums,result,i+1,list);
            //不删除该元素会导致，递归回去的时候会把加上的数都带上 如果到了[1,2,3]时回去时到[1,3]的情况，会有[1,2,3,3]
            list.remove(list.size()-1);
        }

    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3};
        subsets(arr);
     }
}
