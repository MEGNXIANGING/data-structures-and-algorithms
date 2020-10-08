package com.example.algorithm.datastructuresalgorithms.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: apple
 * @Description: 示例 1:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * @Date: 2020/10/8 下午10:42
 */
public class FindArrayTarget {

    public int search(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i:nums){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        if (map.containsKey(target)){
            return map.get(target);
        }
        return 0;
    }
}
