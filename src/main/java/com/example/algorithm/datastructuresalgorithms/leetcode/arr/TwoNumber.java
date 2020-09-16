package com.example.algorithm.datastructuresalgorithms.leetcode.arr;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/14 下午9:53
 */
public class TwoNumber {
    public static void main(String[] args) {

    }

    public static int[] methodName(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap();
        for (Integer num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer num : nums2
        ) {
            if (map.containsKey(num) && map.get(num) > 1) {
                map.put(num, map.get(num) - 1);
            }
        }
        int[] result = new int[list.size()];
        int index = 0;
        for (Integer num: list
             ) {
            result[index++]=num;
        }
        return result;
    }
}


class  huawei{
    public static void main(String[] args) {
        method("asdfas","werasdfaswer");
    }
    public static void  method(String str1,String str2){

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int index=0;
        for (char c1:chars1){
            for (char c2:chars2){
                if (c1==c2){
                    index++;
                }{
                    index=0;
                }
            }
        }
        System.out.println(index);
    }
}


