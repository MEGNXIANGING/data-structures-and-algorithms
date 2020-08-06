package com.example.algorithm.datastructuresalgorithms.algor.tree;

/**
 * @Author: apple
 * @Description: binary search tree
 * @Date: 2020/4/19 上午11:42
 */
public class BinarySearchTree<E extends Comparable> {
    private int size;
    private Node<E> root;

    public int size() {
        return size;
    }

    public boolean isEmp() {
        return size == 0;
    }

    public void clear() {

    }

    public void add(E element) {
        elementNotNullCheck(element);
        if (root == null) {
            //add first node
            root = new Node<>(element, null);
            size++;
            return;
        }
        //and other node
        Node<E> node = root;
        Node<E> parent=root;
        int com=0;
        while (node != null) {
             com = compare(element, node.element);
            parent=node;
            if (com > 0) {
                node = node.right;
            } else if (com < 0) {
                node = node.left;
            } else {
                return;
            }
        }
        Node<E> eNode = new Node<>(element, parent);
        if (com>0){
            parent.right=eNode;
        }else {
            parent.left=eNode;
        }
        size++;
    }

    public void remove(E element) {

    }

    public boolean contains(E element) {
        return false;
    }

    private void elementNotNullCheck(E element) {
        if (element == null) {
            throw new IllegalArgumentException("element must null be null");
        }
    }

    private int compare(E e1, E e2) {
        return e1.compareTo(e2);
    }

    private static class Node<E> {
        E element;
        Node<E> left;
        Node<E> right;
        Node<E> parent;

        public Node(E element, Node<E> parent) {
            this.element = element;
            this.parent = parent;
        }

    }

}
