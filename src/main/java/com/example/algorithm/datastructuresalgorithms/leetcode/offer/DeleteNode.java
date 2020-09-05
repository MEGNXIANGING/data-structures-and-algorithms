package com.example.algorithm.datastructuresalgorithms.leetcode.offer;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/15 上午11:53
 */
public class DeleteNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy;
        while(cur.next!=null){
            if(cur.next.val==val)cur.next=cur.next.next;
            else cur=cur.next;
        }
        return dummy.next;
    }


}
