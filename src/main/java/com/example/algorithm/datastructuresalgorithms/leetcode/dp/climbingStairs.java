package com.example.algorithm.datastructuresalgorithms.leetcode.dp;

/**
 * @Author: apple
 * @Description:
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date: 2021/3/25 下午10:58
 */
public class climbingStairs {
    public static void main(String[] args) {
        System.out.println( climbStairs1(10));
    }
    public static int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public static int climbStairs1(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int a=1;
        int b=2;
        int temp=0;
        for (int i = 3; i <=n ; i++) {
            temp=a+b;
            a=b;
            b=temp;
        }

        return temp;
    }
}
