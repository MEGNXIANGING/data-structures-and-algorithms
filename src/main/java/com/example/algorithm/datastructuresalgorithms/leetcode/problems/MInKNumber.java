package com.example.algorithm.datastructuresalgorithms.leetcode.problems;

/**
 * @Author: apple
 * @Description:
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * @Date: 2020/8/9 下午7:06
 */
public class MInKNumber {
    public static int[] getLeastNumbers(int[] arr, int k)  {
        if (arr==null || arr.length<2){
            return null;
        }
        int[] nums=new int[k];
        int temp;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            nums[i]=arr[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={2,6,5,8,7,12};
        int[] leastNumbers = getLeastNumbers(nums, 2);
        System.out.println(leastNumbers);
    }
}
