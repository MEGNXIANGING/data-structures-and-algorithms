package com.example.algorithm.datastructuresalgorithms.xiaomage.array;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/29 下午10:04
 */
public class ArrayList<E> {
    private int size;
    private E[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private static final int ELEMENT_NOT_FIND = -1;

    public ArrayList(int cpa) {
        cpa = Math.max(cpa, DEFAULT_CAPACITY);
        elements = (E[]) new Object[cpa];
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public void clear() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(E element) {
        return indexOf(element) != ELEMENT_NOT_FIND;
    }

    public void add(E element) {
        add(size,element);
    }

    public void add(int index,E element){
        rangeCheckForAnd(index);
        ensureCapacity(index+1);
        for (int i = size-1; i >=index; i--) {
            elements[i+1]=elements[i];
        }
        elements[index]=element;
        size++;
    }

    private void ensureCapacity(int capacity){
        int oldCapacity=elements.length;
        if (capacity<=oldCapacity){
            return;
        }
        int newCapacity=oldCapacity+oldCapacity>>1;
        E[] newElements= (E[]) new Object[newCapacity];
        for (int i = 0; i <size ; i++) {
            newElements[i]=elements[i];
        }
        elements=newElements;
    }

    public E get(int index) {
        rangeCheck(index);
        return elements[index];
    }

    public E set(int index, E element) {
        rangeCheck(index);
        E old = elements[index];
        elements[index] = element;
        return old;
    }

    public E remove(int index) {
        rangeCheck(index);
        E old=elements[index];
        for (int i = index+1; i < size; i++) {
            elements[i-1]=elements[i];
        }
        size--;
        return old;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return ELEMENT_NOT_FIND;
    }

    private void rangeCheck(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index out of bound");
        }
    }

    private void rangeCheckForAnd(int index){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index out of bound");
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("size=").append(size).append(",[");
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                str.append(",");
            }
            str.append(elements[i]);
        }
        str.append("]");
        return str.toString();
    }
}
