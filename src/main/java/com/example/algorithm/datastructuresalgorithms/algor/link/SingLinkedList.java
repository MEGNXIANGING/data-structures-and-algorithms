package com.example.algorithm.datastructuresalgorithms.algor.link;

import com.example.algorithm.datastructuresalgorithms.algor.AbstractList;

/**
 * @Author: apple
 * @Description: ..
 * @Date: 2020/2/27 下午10:16
 * linkedList  不需要构造函数，因为他不用让别人声明容量
 */
public class SingLinkedList<E> extends AbstractList<E> {

    private Node first;

    @Override
    public void clear() {
        size = 0;
        first = null;
    }

    @Override
    public E get(int index) {
        return node(index).element;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = node(index);
        E old = node.element;
        node.element = element;
        return old;
    }

    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        if (index == 0) {
            first = new Node(element, first);
        } else {
            Node<E> previous = node(index - 1);
            previous.next = new Node<>(element, previous.next);
        }
        size++;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        Node<E> node = first;
        if (index == 0) {
            first = first.next;
        } else {
            Node<E> prev = node(index - 1);
            node = prev.next;
            prev.next = prev.next.next;
        }
        size--;
        return node.element;
    }

    @Override
    public int indexOf(E element) {
        Node<E> node = first;
        if (element == null) {
            for (int i = 0; i <size ; i++) {
                if (node.element==null){
                    return i;
                }
                node=node.next;
            }
        }else {
            for (int i = 0; i <size ; i++) {
                if (node.element.equals(element)){
                    return i;
                }
                node=node.next;
            }
        }
        return ELEMENT_NOT_FIND;
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("aaa我挂了");
        }
    }

    private Node<E> node(int index) {
        rangeCheck(index);

        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public String toString() {
        StringBuilder rs = new StringBuilder();
        rs.append("Size:").append(size).append("  [");
        Node<E> node=first;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                rs.append(", ");
            }
            rs.append(node.element);
            node=node.next;
        }
        rs.append(" ]");
        return rs.toString();
    }

}
