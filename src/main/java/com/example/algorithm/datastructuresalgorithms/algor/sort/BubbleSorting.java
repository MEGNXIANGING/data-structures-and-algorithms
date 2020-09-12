package com.example.algorithm.datastructuresalgorithms.algor.sort;

import java.util.Arrays;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 下午7:44
 */
public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr=new int[]{2,6,4,9,7,3};
        sort(arr);
        System.out.println(dichotomy(arr,7));
        System.out.println(Arrays.toString(arr));
    }

    /**
     * i length-1
     * j arr-i-1
     * @param arr
     */
    public static void sort(int[] arr){
        int temp;
        boolean flag=false;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    flag=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if (flag==false){
                break;
            }else {
                flag=false;
            }
        }
    }

    public static int dichotomy(int [] arr,int k){
        int left=0;
        int right=arr.length-1;

        while (left<=right){
            int mid=left+(right-left)/2;
            if (arr[mid]==k){
                return mid;
            }else if (arr[mid]>k){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }

}
