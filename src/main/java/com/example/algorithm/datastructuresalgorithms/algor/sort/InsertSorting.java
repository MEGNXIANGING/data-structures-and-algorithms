package com.example.algorithm.datastructuresalgorithms.algor.sort;

import java.util.Arrays;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 下午9:57
 */
public class InsertSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 4, 9, 7, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int []arr){
        for (int i = 1; i <arr.length ; i++) {
            int insertVal=arr[i];
            int insertIndex=i-1;
            //从第一个开始找位置
            while (insertIndex>=0 && insertVal<arr[insertIndex]){
                arr[insertIndex+1]=arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1]=insertVal;
        }
    }
}
