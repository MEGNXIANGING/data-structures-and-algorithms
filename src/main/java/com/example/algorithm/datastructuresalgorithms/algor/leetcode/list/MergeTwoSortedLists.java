package com.example.algorithm.datastructuresalgorithms.algor.leetcode.list;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/3/12 下午7:13
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList<>();
        while (l1!=null){
            list.add(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            list.add(l2.val);
            l2=l2.next;
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        ListNode newHead  =new ListNode(list.get(0));
        ListNode temp=newHead;
        for (int i = 1; i <list.size() ; i++) {
            temp.next=new ListNode(list.get(i));
        }
        return newHead;
    }

}
