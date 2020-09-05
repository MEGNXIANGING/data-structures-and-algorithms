package com.example.algorithm.datastructuresalgorithms.xiaomage.tree;

import java.util.*;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/4 下午9:20
 */
public class BinarySearchTree<E> {
    private int size;
    private Node root;
    private Comparator<E> comparator;

    public BinarySearchTree(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    public BinarySearchTree() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
    }

    public void add(E element) {
        elementNoNullCheck(element);
        if (root == null) {
            root = new Node<>(element, null);
            size++;
            return;
        }
        //find parent node
        Node<E> node = root;
        Node parent = null;
        int cmp = 0;
        while (node != null) {
            cmp = compare(element, node.element);
            parent = node;
            if (cmp > 0) {
                node = node.right;
            } else if (cmp < 0) {
                node = node.left;
            } else {
                return;
            }
        }
        //insert data
        Node<E> n = new Node<>(element, parent);
        if (cmp > 0) {
            parent.right = n;
        } else {
            parent.left = n;
        }
        size++;
    }

    public void remove(E element) {

    }

    public boolean contains(E element) {
        return false;
    }

    public int height() {
        return height(root);
    }

    public int height(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int heightLevel(Node node){
        if (node == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        int height=0;
        int levelSize=1;
        while (!queue.isEmpty()){
            Node poll = queue.poll();
            levelSize--;
            if (poll.left!=null){
                queue.offer(poll.left);
            }
            if (poll.right!=null){
                queue.offer(poll.right);
            }
            if (levelSize==0){
                levelSize=queue.size();
                height++;
            }
        }
        return height;
    }

    private int compare(E o1, E o2) {
        if (comparator == null) {
            return ((Comparable<E>) o1).compareTo(o2);
        }
        return comparator.compare(o1, o2);
    }

    public void traversal() {

    }

    //前序遍历  先访问左子树，再访问右子树
    public void preorderTraversal(Node node) {
        if (node == null) return;
        System.out.print(node.element);
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    // 中序遍历  输出的节点是升序或者降序
    public void inorderTraversal(Node node) {
        if (node == null) return;
        inorderTraversal(node.right);
        System.out.println(node.element);
        inorderTraversal(node.left);
    }

    //后序遍历  先遍历左  再遍历右  再访问根节点
    public void postorderTraversal(Node node) {
        if (node == null) return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.println(node.element);
    }

    public void levelOrderTraversal(Visitor visitor) {

        Node node = this.root;
        if (node == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            Node n = queue.poll();
//            System.out.println(n.element);
            if (visitor.visitor(n.element)) return;
            if (n.left != null) {
                queue.offer(n.left);
            }
            if (n.right != null) {
                queue.offer(n.right);
            }
        }

    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        toString(root, sb, "");
        return sb.toString();
    }

    public void toString(Node node, StringBuffer sb, String prefix) {
        if (node == null) return;
        toString(node.left, sb, prefix + "L---");
        sb.append(prefix).append(node.element).append("\n");
        toString(node.right, sb, prefix + "R---");
    }

    public void elementNoNullCheck(E element) {
        if (element == null) {
            throw new IllegalArgumentException("element must not be null");
        }
    }

    private class Node<E> {
        private E element;
        private Node<E> left;
        private Node<E> right;
        private Node<E> parent;

        public Node(E element, Node parent) {
            this.element = element;
            this.parent = parent;
        }
    }

}
