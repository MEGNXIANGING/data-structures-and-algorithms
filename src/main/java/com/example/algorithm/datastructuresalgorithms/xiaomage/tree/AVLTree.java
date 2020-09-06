package com.example.algorithm.datastructuresalgorithms.xiaomage.tree;

import java.util.Comparator;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/6 下午2:54
 */
public class AVLTree<E> extends BinarySearchTree {
    public AVLTree(Comparator<E> comparator) {
        super(comparator);
    }

    @Override
    protected void afterAdd(Node node) {
        super.afterAdd(node);
    }
}
