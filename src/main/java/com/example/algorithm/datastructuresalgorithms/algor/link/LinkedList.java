package com.example.algorithm.datastructuresalgorithms.algor.link;

import com.example.algorithm.datastructuresalgorithms.algor.AbstractList;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/3/8 下午7:58
 */
public class LinkedList<E> extends AbstractList<E> {
    private Node<E> first;
    private Node<E> last;


    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }
    }


    @Override
    public void clear() {
        size = 0;
        first = null;
        last = null;
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
        //insert the element last
        if (index == size) {
            Node<E> oldLast = last;
            last = new Node<>(last, element, null);
            if (oldLast==null){
                first=last;
            }else {
                oldLast.next = last;
            }
        } else {
            Node<E> next = node(index);
            Node<E> prev = next.prev;
            Node<E> node = new Node<>(prev, element, next);
            if (prev==null){
                first=node;
            }else {
                prev.next=node;
                next.prev=node;
            }
        }
        size++;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        Node<E> node = node(index);
        Node<E> prev = node.prev;
        Node<E> next = node.next;
        if (prev==null){
            first=next;
        }else {
            prev.next=next;
        }
        if (next==null){
            last=prev;
        }else {
            next.prev=prev;
        }
        size--;
        return node.element;
    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }

    private Node<E> node(int index) {
        rangeCheck(index);
        Node<E> node;
        if (index < (index >> 1)) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
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
