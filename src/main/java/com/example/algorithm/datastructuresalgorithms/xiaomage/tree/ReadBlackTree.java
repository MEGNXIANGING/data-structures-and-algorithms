package com.example.algorithm.datastructuresalgorithms.xiaomage.tree;

import java.util.Comparator;

/**
 * @Author: apple
 * @Description: 红黑树的性质：
 * 1、节点必须是red或者是black的
 * 2、根节点必须是black
 * 3、叶子节点必须是black
 * 4、red节点的子节点必须是black
 * 5、从任一节点到叶子节点的black的数量是一致的
 *
 *  红黑数的增删效率高与AVL数  但是查询效率AVL数更高  因为AVL树 树高会相对矮一些
 * @Date: 2020/9/7 下午5:37
 */
public class ReadBlackTree<E> extends BinarySearchTree {
    private static boolean RED = true;
    private static boolean BLACK = false;

    public ReadBlackTree(Comparator comparator) {
        super(comparator);
    }

    @Override
    protected void afterAdd(Node node) {
        // todo
        super.afterAdd(node);
    }

    @Override
    protected void afterRemove(Node node) {
        super.afterRemove(node);
    }

    public boolean colorOf(Node node) {
        if (node == null) return BLACK;
        return ((RBtree<E>) node).color;
    }

    private Node red(Node node) {
        return color(node, RED);
    }

    private Node black(Node node) {
        return color(node, BLACK);
    }

    /**
     * 染色
     *
     * @param node
     * @param color
     * @return
     */
    private Node color(Node node, boolean color) {
        if (node == null) return null;
        ((RBtree<E>) node).color = color;
        return node;
    }

    private class RBtree<E> extends Node {
        boolean color;

        public RBtree(E element, Node parent) {
            super(element, parent);
        }


    }

}
