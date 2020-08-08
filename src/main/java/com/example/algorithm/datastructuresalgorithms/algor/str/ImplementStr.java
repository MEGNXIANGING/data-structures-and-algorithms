package com.example.algorithm.datastructuresalgorithms.algor.str;

/**
 * @Author: apple
 * @Description: 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date: 2020/8/7 下午9:19
 */
public class ImplementStr {

    public static int strStr(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();
        if (L == 0) return 0;

        int pn = 0;
        while (pn < n - L + 1) {
            // find the position of the first needle character
            // in the haystack string
            while (pn < n - L + 1 && haystack.charAt(pn) != needle.charAt(0)) ++pn;

            // compute the max match string
            int currLen = 0, pL = 0;
            while (pL < L && pn < n && haystack.charAt(pn) == needle.charAt(pL)) {
                ++pn;
                ++pL;
                ++currLen;
            }

            // if the whole needle string is found,
            // return its start position
            if (currLen == L) return pn - L;
            // otherwise, backtrack
            pn = pn - currLen + 1;
        }
        return -1;
    }
    public static int Str2(String haystack, String needle){
        if (needle==null||needle.equals("")||haystack.equals(needle)){
            return 0;
        }
        int n = needle.length(), h = haystack.length();
        String[] haystackSplit = haystack.split("");
        String[] needleSplit = needle.split("");

        for (int i = 0; i < h-1; i++) {
            if (haystackSplit[i].equals(needleSplit[0])){
                if (i+n<=h){
                    String tmp = "";
                    for (int j = i; j <i+n ; j++) {
                        tmp=tmp+haystackSplit[j];
                    }
                    if (tmp.equals(needle)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public int strStr3(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.equals(haystack)) return 0;
        if (needle.length() > haystack.length()) return -1;
        for (int i=0; i<=haystack.length()-needle.length(); i++){
            if (haystack.substring(i, i+needle.length()).equals(needle)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int i = Str2("mississippi", "pi");
        System.out.println(i);
    }

}
