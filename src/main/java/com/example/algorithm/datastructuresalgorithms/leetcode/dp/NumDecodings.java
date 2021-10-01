package com.example.algorithm.datastructuresalgorithms.leetcode.dp;

public class NumDecodings {
    /**
     * 一条包含字母 A-Z 的消息通过以下映射进行了 编码 ：
     *
     * 'A' -> 1
     * 'B' -> 2
     * ...
     * 'Z' -> 26
     * 要 解码 已编码的消息，所有数字必须基于上述映射的方法，反向映射回字母（可能有多种方法）。例如，"11106" 可以映射为：
     *
     * "AAJF" ，将消息分组为 (1 1 10 6)
     * "KJF" ，将消息分组为 (11 10 6)
     * 注意，消息不能分组为  (1 11 06) ，因为 "06" 不能映射为 "F" ，这是由于 "6" 和 "06" 在映射中并不等价。
     *
     * 给你一个只含数字的 非空 字符串 s ，请计算并返回 解码 方法的 总数 。
     *
     * 题目数据保证答案肯定是一个 32 位 的整数。
     * @param ss
     * @return
     */
    public int numDecodings(String ss) {
        char[] s = ss.toCharArray();
        int n = s.length;
        if (n==0){
            return 0;
        }
        int []f=new int[n+1];
        f[0]=0;
        for (int i = 1; i <=n ; i++) {
            f[i]=0;
            int t= s[i-1]-'0';
            if (t>=1 && t<=9){
                f[i]+=f[i-1];
            }
            if (i>=2){
                  t=(s[i-2]-'0')*10+(s[i-1]-'0');
                  if (t>=10&& t<=26){
                      f[i]+=f[i-2];
                  }
            }
        }
        return f[n];
    }
}
