package com.example.algorithm.datastructuresalgorithms.algor.leetcode.list;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/2/29 下午4:23
 * 237. 删除链表中的节点
 */
public class Number237 {




    class Solution {
        public void deleteNode(ListNode node) {
            ListNode last= node.next;
            node.val=last.val;
            node.next=node.next.next;
        }
    }
}
