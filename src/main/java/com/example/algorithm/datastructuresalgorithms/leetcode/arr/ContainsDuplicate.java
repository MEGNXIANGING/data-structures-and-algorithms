package com.example.algorithm.datastructuresalgorithms.leetcode.arr;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: apple
 * @Description:
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contains-duplicate
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Input: [1,2,3,1]
 * Output: true
 * @Date: 2020/12/13 下午8:23
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] a={1,2,3,1};
        boolean b = containsDuplicate(a);
        System.out.println(b);

    }

    public static boolean containsDuplicate(int[] nums) {
        List<Integer> m= new ArrayList<>();
        for(Integer n:nums){
           if ( m.contains(n)){
               return true;
           }else {
               m.add(n);
           }

        }
        return false;
    }

}
