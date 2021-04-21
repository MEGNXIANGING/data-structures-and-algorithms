package com.example.algorithm.datastructuresalgorithms.leetcode.str;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: apple
 * @Description:
 * Given a string s, find the length of the longest substring without repeating characters.
 *Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date: 2021/3/27 下午11:36
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s="abcabcbb";
//        System.out.println(lengthOfLongestSubstring(s));
//        System.out.println(lengthOfLongestSubstring1(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res=0;
        for (int i = 0,j=0; i <s.length() ; i++) {
            Character a=s.charAt(i);
            if (map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else {
                map.put(a,1);
            }
            while (map.get(a)>1){

            }
        }
        return 1;
    }

//    public static int lengthOfLongestSubstring1(String s) {
//        // 记录字符上一次出现的位置
//        int l = 0, r = 0;
//        int maxlen = 0;
//
//        for( ; r < s.length(); r++ ) {
//            for( int k = l; k < r; k++ ) // 检查新元素是否在窗口内出现过
//                if( s[r] == s[k] ) { // s[r]为新元素
//                    l = k+1;
//                    break; // 重新设置左边界后，就可以检查下一个新元素了
//                }
//            if(r-l+1 > maxlen)
//                maxlen = r-l+1;
//        }
//        return maxlen;
//    }
}
