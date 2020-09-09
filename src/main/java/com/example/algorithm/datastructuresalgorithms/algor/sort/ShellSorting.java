package com.example.algorithm.datastructuresalgorithms.algor.sort;

import java.util.Arrays;

/**
 * @Author: apple
 * @Description:
 * 希尔排序
 * @Date: 2020/9/9 下午11:07
 */
public class ShellSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 4, 9, 7, 3};
        sort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 分组排序-交换法
     * 通过分组减少外层循环次数
     * 比较复杂
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            int temp = 0;
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
    }

    /**
     * 移位法
     * 优秀的算法
     * @param arr
     */
    public static void sort2(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j-gap>=0&&temp<arr[j-gap]){
                        arr[j]=arr[j-gap];
                        j-=gap;
                    }
                    arr[j]=temp;
                }
            }

        }
    }
}
