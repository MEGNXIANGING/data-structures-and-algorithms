package com.example.algorithm.datastructuresalgorithms.leetcode.slideWinsow;

import java.util.HashSet;

public class MaxVowels {
    /**
     * 给你字符串 s 和整数 k 。
     *
     * 请返回字符串 s 中长度为 k 的单个子字符串中可能包含的最大元音字母数。
     *
     * 英文中的 元音字母 为（a, e, i, o, u）。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * 滑动窗口
     * @param s
     * @param k
     * @return
     */
    public static int maxVowels(String s, int k) {
        if (s==null||s.length()==0){
            return 0;
        }
        HashSet<Character> sets = new HashSet<>();
        sets.add('a');
        sets.add('e');
        sets.add('i');
        sets.add('o');
        sets.add('u');

        char[] chars = s.toCharArray();
        int count=0;
        int res=0;
        //计算第一个窗口的元音数量
        for (int i = 0; i <k ; i++) {
            if (sets.contains(chars[i])){
                count++;
            }
        }
        res=count;
        for (int i = k; i < chars.length; i++) {
            char aChar = chars[i];
            char aChar1 = chars[i - k];
            if (sets.contains(aChar1)){
                count--;
            }
            if (sets.contains(aChar)){
                count++;
            }
            res=Math.max(res,count);
        }
        return res;
    }

    public static void main(String[] args) {
        String a="weallloveyou";
        maxVowels(a,7);
    }
}
