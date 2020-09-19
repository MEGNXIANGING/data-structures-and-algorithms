package com.example.algorithm.datastructuresalgorithms.xiaomage.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/4 下午10:58
 */
public class Main {


    public static void change(char[] value) {
        value = "Welcome".toCharArray();
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        System.out.println(9 | 7);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> parentSet = new HashSet<>();
        Set<Integer> childSet = new HashSet<>();
        for (Integer num : nums1) {
            parentSet.add(num);
        }
        for (Integer num : nums2) {
            if (parentSet.contains(num)) {
                childSet.add(num);
            }
        }
        int[] resArr = new int[childSet.size()];
        int index = 0;
        for (Integer a : childSet) {
            resArr[index++] = a;
        }

        return resArr;

    }

    public static int[] intersection1(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        HashSet<Integer> set = new HashSet<>();
        int temp;
        for (int i = 0; i < nums1.length; i++) {
            temp = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (temp == nums2[j]) {
                    set.add(temp);
                }
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            result[index++] = num;
        }
        return result;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) + 1);
            }
        }
        int[] result = new int[list.size()];
        int index = 0;
        for (Integer num : list) {
            result[index++] = num;
        }
        return result;
    }

    public static int[] methodName(int nums1[], int nums2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, 1 + map.get(num));
            } else {
                map.put(num, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] result = new int[list.size()];
        int index = 0;
        for (Integer num : list) {
            result[index++] = num;
        }
        return result;
    }

}

class B {
    public int f(int i) {
        return i + i;
    }

    public int f(int i, int j) {
        return i + j;
    }

    public int f(char c) {
        return c;
    }
}




