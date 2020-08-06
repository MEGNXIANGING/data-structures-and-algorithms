package com.example.algorithm.datastructuresalgorithms.algor.link;

import com.example.algorithm.datastructuresalgorithms.algor.List;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/2/29 下午4:04
 */
public class TestLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2,6);
        list.remove(4);
        System.out.println(list);
        System.out.println(list.indexOf(2));

    }
}
