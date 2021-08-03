package com.example.algorithm.datastructuresalgorithms.leetcode;

import java.util.LinkedList;
import java.util.Queue;

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
}
