package com.example.algorithm.datastructuresalgorithms.algor.sort;

import java.util.Arrays;

/**
 * @Author: apple
 * @Description: 比较并交换
 * @Date: 2020/9/9 下午8:36
 */
public class SelectSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 4, 9, 7, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 边界条件
     *  (i)length-1
     *  (j)j=i+1
     * @param arr
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[minIndex];
            for (int j = i+1; j < arr.length  ; j++) {
                if (min > arr[j]) {
                    min = arr[j]; //重置min
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
