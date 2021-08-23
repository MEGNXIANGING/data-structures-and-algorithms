package com.example.algorithm.datastructuresalgorithms.leetcode.tree;

import com.example.algorithm.datastructuresalgorithms.algor.List;
import com.example.algorithm.datastructuresalgorithms.algor.array.ArrayList;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root,list);
        return list;
    }

    public void preorderTraversal(TreeNode node, List<Integer> list) {
        list.add(node.val);
        if (node.left!=null){
            preorderTraversal(node.left,list);
        }
        if (node.right!=null){
            preorderTraversal(node.right,list);
        }

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
