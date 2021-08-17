package com.example.algorithm.datastructuresalgorithms.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList();
    }

    public int ping(int i) {
        queue.add(i);
        while (queue.size() > 0 && i - queue.peek() < 3000) {
            queue.poll();
        }
        return queue.size();
    }

    public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char a= chars[i];
            if (a=='('||a=='['||a=='{'){
                characters.add(a);
            }else {
                Character pop = characters.pop();
                String v=pop+""+a;
                if (!v.equals("()")&&!v.equals("{}")&&!v.equals("[]")){
                    return false;
                }
            }
        }
        return characters.size()==0;
    }
}
