package com.example.algorithm.datastructuresalgorithms.leetcode.offer;

import com.example.algorithm.datastructuresalgorithms.xiaomage.list.List;
import com.example.algorithm.datastructuresalgorithms.xiaomage.list.array.ArrayList;

/**
 * @Author: apple
 * @Description:
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 * @Date: 2020/10/10 下午11:46
 */
public class BSTreeKNode {
    private Integer value=0;
    private Integer count=0;
    public int kthLargest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
         traverse(root, list);
        return  list.get(list.size()-k);
    }

    public void traverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            return ;
        }
        if (root.left != null) traverse(root.left, list);
        list.add(root.val);
        if (root.right != null) traverse(root.right, list);
    }

    public void traverse2(TreeNode root,int k) {
        if (root == null) {
            return ;
        }
        if (root.left != null) traverse2(root.left, k);
        if (++count==k){
            value=root.val;
        }
        if (root.right != null) traverse2(root.right, k);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
