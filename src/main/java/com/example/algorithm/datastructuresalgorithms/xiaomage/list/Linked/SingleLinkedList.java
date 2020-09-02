package com.example.algorithm.datastructuresalgorithms.xiaomage.list.Linked;

import com.example.algorithm.datastructuresalgorithms.xiaomage.list.AbstractLIst;
import com.example.algorithm.datastructuresalgorithms.xiaomage.list.List;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/31 下午1:45
 */
public class SingleLinkedList<E> extends AbstractLIst implements List {

    private Node first;

    @Override
    public void clear() {
        size = 0;
        first = null;
    }


    @Override
    public void add(int index, Object element) {
        rangeCheckForAnd(index,size);
        if (index == 0) {
            first = new Node<>(element, first);
        } else {
            Node<E> prev = node(index - 1);
            prev.next = new Node<>(element, prev.next);
        }
        size++;
    }

    @Override
    public Object get(int index) {
        return node(index).element;
    }

    @Override
    public Object set(int index, Object element) {
        Node<E> node = node(index);
        E rs = node.element;
        node.element = (E) element;
        return rs;
    }

    @Override
    public Object remove(int index) {
        Node node = first;
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
    public int indexOf(Object element) {
        Node node = first;
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (node.element == null) {
                    return i;
                }
                node = node.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(node.element)) {
                    return i;
                }
                node = node.next;
            }
        }
        return -1;
    }

    private Node<E> node(int index) {
        rangeCheck(index, size);
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("size=").append(size).append(",[");
        Node node = first;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                str.append(",");
            }
            str.append(node.element);
            node=node.next;
        }
        str.append("]");
        return str.toString();
    }


    private  class Node<E> {
        private E element;
        private Node next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }
}
