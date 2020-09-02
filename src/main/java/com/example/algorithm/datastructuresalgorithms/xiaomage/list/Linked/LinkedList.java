package com.example.algorithm.datastructuresalgorithms.xiaomage.list.Linked;

import com.example.algorithm.datastructuresalgorithms.xiaomage.list.AbstractLIst;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/2 下午7:04
 */
public class LinkedList<E> extends AbstractLIst<E> {
    private Node<E> first;
    private Node<E> last;

    private class Node<E> {
        private E element;
        private Node next;
        private Node prev;

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public void clear() {
        size=0;
        first=null;
        last=null;
    }

    @Override
    public void add(int index, Object element) {
        rangeCheckForAnd(index,size);
        if (index==size-1){
            Node oldLast=last;
            last= new Node<E>((E) element,null,oldLast);
            if (oldLast==null){
                first=last;
            }else {
                oldLast.next=last;
            }
        }
        Node next = node(index);
        Node prev = next.prev;
        Node<E> node = new Node<E>((E) element, next, prev);
        next.prev=node;
        if (prev==null){
            first=node;
        }else {
            prev.next=node;
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
        E old = node.element;
        node.element= (E) element;
        return old;
    }

    @Override
    public Object remove(int index) {
        rangeCheck(index,size);
        Node<E> node = node(index);
        E old = node.element;
        if (node.prev==null){
            first=node.next;
        }else {
            node.prev.next=node.next.next;
        }
        if (node.next==null){
            last=node.prev;
        }else {
            node.next.prev=node.prev;
        }
        size--;
        return old;
    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }

    private Node<E> node(int index) {
        rangeCheck(index, size);
        Node node;
        if (index < (size >> 1)){
             node=first;
            for (int i = 0; i <index ; i++) {
                node=node.next;
            }
        }else {
            node=last;
            for (int i = size-1; i >index ; i--) {
                node=node.prev;
            }
        }
        return node;
    }
}
