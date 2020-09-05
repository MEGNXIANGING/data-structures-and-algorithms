package com.example.algorithm.datastructuresalgorithms.leetcode.offer;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/13 下午11:12
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处
 * 示例 1：
 *
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 */
public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        if (s==null || n==0){
            return s;
        }
        StringBuffer start = new StringBuffer();
        StringBuffer end = new StringBuffer();
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            if (i>=n){
                start.append(split[i]);
            }else {
                end.append(split[i]);
            }
        }
        return start.append(end).toString();
    }
    public String reverseLeftWords1(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
