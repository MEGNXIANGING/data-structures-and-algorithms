package com.example.algorithm.datastructuresalgorithms.algor;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: apple
 * @Description: this is algorihm
 * @Date: 2020/2/25 上午11:26
 */
public class FibonacciSequence {
    private Map<Integer, Integer> result = new HashMap<>();

    //    0,1,1,2,3,5,8,13.......
    //O(2^n)  辣鸡
    public static int fib1(int n) {
        if (n <= 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    //O(n)  给力给力
    public static int fib2(int n) {
        int first = 0;
        int second = 1;
        if (n <= 1) {
            return n;
        }
        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    public static int fib3(int N) {
        double c = Math.sqrt(5);
        return (int) ((Math.pow((1 + c) / 2, N) - Math.pow((1 - c) / 2, N)) / c);
    }


    public static void main(String[] args) {

        System.out.println(fibonacciSequence1(6));
    }

    public static int fibonacciSequence1(int n){
        if (n<=1){
            return n;
        }
        return fibonacciSequence1(n-1)+fibonacciSequence1(n-2);
    }
}
