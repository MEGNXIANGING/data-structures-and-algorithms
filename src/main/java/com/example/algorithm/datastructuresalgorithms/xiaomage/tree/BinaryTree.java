package com.example.algorithm.datastructuresalgorithms.xiaomage.tree;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/6 下午2:47
 */
public abstract class BinaryTree<E> {
    protected int size;
    protected Node root;
    protected  int height;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        root=null;
        size = 0;
    }

    /**
     * 添加node之后的调整
     * @param node
     */
    protected  void afterAdd(Node node){

    }

    public Node precursor(Node node){
        if (node==null) return null;
        if (node.left!=null){
            Node pop = node.left;
            while (pop.right!=null){
                pop= pop.right;
            }
            return pop;
        }
        while (node.parent!=null && node==node.parent.left){
            node=node.parent;
        }
        return node.parent;
    }

    public Node subsequent(Node node){
        if (node==null) return null;
        if (node.right!=null){
            Node pop = node.right;
            while (pop.left!=null){
                pop= pop.left;
            }
            return pop;
        }
        while (node.parent!=null && node==node.parent.right){
            node=node.parent;
        }
        return node.parent;
    }
    protected class Node<E> {
         E element;
         Node<E> left;
         Node<E> right;
         Node<E> parent;

        public Node(E element, Node<E> parent) {
            this.element = element;
            this.parent = parent;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    '}';
        }
    }
}
