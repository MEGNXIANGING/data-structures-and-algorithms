package com.example.algorithm.datastructuresalgorithms.leetcode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer item:nums){
            if (map.containsKey(item)){
                return true;
            }else {
                map.put(item,1);
            }
        }
        return false;
    }
}
