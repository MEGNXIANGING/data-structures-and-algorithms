package com.example.algorithm.datastructuresalgorithms.leetcode.backtrack;

import com.example.algorithm.datastructuresalgorithms.algor.List;
import com.example.algorithm.datastructuresalgorithms.algor.array.ArrayList;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTracking(n,result,0,0,"");
        return  result;
    }

    private void backTracking(int n, List<String> result, int left, int right, String str) {
        if (right>left){
            return;
        }
        if (left==right&& left==n){
            result.add(str);
            return;
        }
        if (left<n){
            backTracking(n,result,left+1,right,str+"(");
        }
        if (right<left){
            backTracking(n,result,left,right+1,str+")");
        }
    }
}
