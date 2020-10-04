package com.example.algorithm.datastructuresalgorithms.leetcode.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: apple
 * @Description:
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date: 2020/10/4 上午10:47
 */
public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Integer i:nums2){
            if (map.containsKey(i) && map.get(i)>0){
                arrayList.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int[] result=new int[arrayList.size()];
        int index=0;
        for (Integer i:arrayList
             ) {
            result[index++]=i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints1 = {1, 2, 2, 1};
        int[] ints2 = { 2, 2};
        int[] intersection = intersection(ints1, ints2);
        System.out.println(Arrays.toString(intersection));;
    }
}
