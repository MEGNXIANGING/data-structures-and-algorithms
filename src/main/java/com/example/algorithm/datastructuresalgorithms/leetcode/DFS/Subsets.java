package com.example.algorithm.datastructuresalgorithms.leetcode.DFS;


import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums,result,0,new ArrayList<>());
        return result;
    }

    private void dfs(int[] nums, List<List<Integer>> result, int index, List<Integer> list) {
        List<Integer> l2 = new ArrayList<>();
        l2.addAll(list);
        result.add(l2);
        if (index==nums.length){
            return;
        }
        for (int i = index; i <nums.length; i++) {
            list.add(nums[i]);
            dfs(nums,result,i+1,list);
            list.remove(list.size()-1);
        }

    }
}
