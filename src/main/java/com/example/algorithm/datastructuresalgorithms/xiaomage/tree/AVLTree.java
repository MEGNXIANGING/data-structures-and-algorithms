package com.example.algorithm.datastructuresalgorithms.xiaomage.tree;

import java.util.Comparator;

/**
 * @Author: apple
 * @Description: AVLTree:  自平衡的二叉树
 * 每一个节点的平衡因子为0 1 -1
 * 通过LL RR LR RL 旋转来保持树的平衡
 * 或者可以通过统一处理来保持树的平衡
 * (a b c d e f g)
 * <p>
 * 删除操作可能会导致二叉树失去平衡
 * 极端情况要调整（log）n次
 * <p>
 * 平衡因子为左子树高度减右子树的高度
 * <p>
 * 保证了二叉树不会退化成链表
 * 减少了树的高度，树更加平衡  效率远大于二叉搜索树
 *
 *
 *  搜索 logN
 *  删除 logN
 *  添加 logN
 * @Date: 2020/9/6 下午2:54
 */
public class AVLTree<E> extends BinarySearchTree {
    public AVLTree(Comparator<E> comparator) {
        super(comparator);
    }


    @Override
    protected void afterAdd(Node node) {
        while ((node = node.parent) != null) {
            if (isBalance(node)) {
                //平衡
                updateNode(node);
            } else {
                //不平衡自旋
                reBalance(node);
                break;
            }
        }
    }

    @Override
    protected Node creatNode(Object element, Node parent) {
        return new AVLNode<>(element, parent);
    }

    private boolean isBalance(Node node) {
        return Math.abs(((AVLNode<E>) node).balanceFactor()) <= 1;
    }

    private void updateNode(Node node) {
        ((AVLNode<E>) node).updateHeight();
    }

    /**
     * avl 删除节点以后自平衡
     * @param node
     */
    @Override
    protected void afterRemove(Node node) {
        while ((node = node.parent) != null) {
            if (isBalance(node)) {
                //平衡
                updateNode(node);
            } else {
                //不平衡自旋
                reBalance(node);
            }
        }
    }

    /**
     * 恢复平衡
     *
     * @param grand 高度最低的节点
     */
    private void reBalance(Node grand) {
        Node parent = ((AVLNode<E>) grand).tallerChild();
        Node node = ((AVLNode<E>) parent).tallerChild();
        if (parent.isLeftChild()) {//L
            if (node.isLeftChild()) { //LL
                rotateLeft(grand);
            } else { //LR
                rotateLeft(parent);
                rotateRight(grand);
            }
        } else {//R
            if (node.isLeftChild()) { //RL
                rotateRight(parent);
                rotateLeft(grand);
            } else { //RR
                rotateRight(grand);
            }
        }
    }

    /**
     * 统一处理  不需要旋转
     *
     * @param r root
     * @param a  1
     * @param b  2
     * @param c  3
     * @param d  4
     * @param e  5
     * @param f  6
     * @param g  7
     */
    private void reBalanceAll(Node r
            , Node a, Node b, Node c
            , Node d
            , Node e, Node f, Node g) {
        //让d成为子树的根节点
        d.parent = r.parent;
        if (r.isLeftChild()) {
            r.parent.left = d;
        } else if (r.parent == null) {
            root = d;
        } else {
            r.parent.right = d;
        }
        //a-b-c
        b.left = a;
        if (a != null) a.parent = b;
        b.right = c;
        if (c != null) c.parent = b;
        updateNode(b);
        //e-f-g
        f.left = e;
        if (e != null) e.parent = f;
        f.right = g;
        if (g != null) g.parent = f;
        updateNode(f);
        //b-d-f
        d.left = b;
        d.right = f;
        b.parent = d;
        f.parent = d;
        updateNode(d);
    }

    /**
     * 12
     * 13
     * 14
     * 树向右长  需要左旋转
     *
     * @param grand
     */
    private void rotateLeft(Node grand) {
        Node parent = grand.right;
        Node child = parent.left;
        grand.right = parent.left;
        parent.left = grand;
        //更新parent
        parent.parent = grand.parent;
        AfterRate(grand, parent, child);
    }

    /**
     * 15
     * 14
     * 13
     * 树向左长   需要右旋转
     *
     * @param grand
     */
    private void rotateRight(Node grand) {
        Node parent = grand.left;
        Node child = grand.right;
        grand.left = child;
        parent.right = grand;
        AfterRate(grand, parent, child);

    }

    private void AfterRate(Node grand, Node parent, Node child) {
        if (grand.isLeftChild()) {
            grand.parent.left = parent;
        } else if (grand.parent == null) {
            //grand是根节点
            root = parent;
        } else {
            grand.parent.right = parent;
        }
        //更新T2（child）
        if (child != null) {
            child.parent = grand;
        }

        //更新grant
        grand.parent = parent;
        //更新高度
        updateNode(parent);
        updateNode(grand);
    }

    private class AVLNode<E> extends Node {
        int height = 1;

        public AVLNode(E element, Node parent) {
            super(element, parent);
        }

        /**
         * @return 平衡因子
         * 左节点的高度减右节点高度
         */
        public int balanceFactor() {
            int leftHeight = left == null ? 0 : ((AVLNode<E>) left).height;
            int rightHeight = right == null ? 0 : ((AVLNode<E>) right).height;
            return leftHeight - rightHeight;
        }

        /**
         * 更新高度
         */
        public void updateHeight() {
            int leftHeight = left == null ? 0 : ((AVLNode<E>) left).height;
            int rightHeight = right == null ? 0 : ((AVLNode<E>) right).height;
            height = 1 + Math.max(leftHeight, rightHeight);
        }

        /**
         *
         */
        public Node tallerChild() {
            int leftHeight = left == null ? 0 : ((AVLNode<E>) left).height;
            int rightHeight = right == null ? 0 : ((AVLNode<E>) right).height;
            if (leftHeight > rightHeight) return left;
            if (leftHeight < rightHeight) return right;
            return isLeftChild() ? left : right;
        }

    }
}
