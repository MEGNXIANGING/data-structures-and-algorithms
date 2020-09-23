package com.example.algorithm.datastructuresalgorithms.algor.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: apple
 * @Description: Given an n-ary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date: 2020/9/23 下午8:24
 */
public class PrTraversal {
    public List<Integer> traversal(Node root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        pt(root,results);
        return results;
    }

    public void pt(Node root,List<Integer> rs){
        if (root==null){
            return;
        }
        rs.add(root.val);
        for (Node n:root.children
             ) {
            pt(n,rs);
        }
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}