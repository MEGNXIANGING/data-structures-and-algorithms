package com.example.algorithm.datastructuresalgorithms.leetcode.offer;

/**
 * @Author: apple
 * @Description:一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *

 * @Date: 2021/3/25 下午11:11
 */
public class qingwa {
    public static void main(String[] args) {

    }
    public int numWays(int n) {
        if (n==1 || n==0){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int a=1;
        int b=2;
        int temp=0;
        for (int i = 3; i <=n ; i++) {
            temp=(a+b)%1000000007;
            a=b;
            b=temp;
        }
        return temp;
    }

}
