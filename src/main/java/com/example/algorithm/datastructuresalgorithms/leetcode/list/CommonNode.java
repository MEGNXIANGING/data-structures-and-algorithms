package com.example.algorithm.datastructuresalgorithms.leetcode.list;

/**
 * @Author: apple
 * @Description:
 * 输入两个链表，找出它们的第一个公共节点。
 * @Date: 2021/3/20 下午8:59
 */
public class CommonNode {
    public static void main(String[] args) {

    }

    /**
     *  我来到你的城市，熟悉的那一条街道
     * @param headA A路
     * @param headB B路
     * @return 相遇
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1=headA,h2=headB;
        while (h1!=h2){
            h1=h1==null?headB:h1.next;
            h2=h2==null?headA:h2.next;
        }
        return h1;
    }
}
