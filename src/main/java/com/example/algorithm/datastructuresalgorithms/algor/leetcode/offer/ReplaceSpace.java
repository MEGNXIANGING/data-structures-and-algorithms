package com.example.algorithm.datastructuresalgorithms.algor.leetcode.offer;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/13 下午10:40
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class ReplaceSpace {
    public static String replaceSpace(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for (char item: s.toCharArray()) {
            if (item==' '){
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(item);
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
}
