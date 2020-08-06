package com.example.algorithm.datastructuresalgorithms.algor.array;

import com.example.algorithm.datastructuresalgorithms.algor.AbstractList;

/**
 * @Author: apple
 * @Description: 集合类的编写
 * @Date: 2020/2/26 下午3:26
 */
public class ArrayList<E> extends AbstractList<E> {

    /**
     * All the elements
     */
    private E[] elements;
    /**
     * default init capacity
     */
    private static final int DEFAULT_CAPACITY = 10;


    /**
     * this is init method
     */
    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * ArrayList 有该构造函数的原因是可以让别人声明容量是多少
     *
     * @param initialCapacity
     */
    public ArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("initialCapacity value can't be negative");
        }
        initialCapacity = (initialCapacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : initialCapacity;
        elements = (E[]) new Object[initialCapacity];
    }


    /**
     * clear all  elements
     * 数组的内存在堆中还存在，但是在数组中存储的内存地址已被销毁，所有对象被gc回收
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    /**
     * Get a elements to the array
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index:" + index + ",size:" + size);
        }
        return elements[index];
    }

    /**
     * Set a elements to the array
     */
    public E set(int index, E element) {
        rangeCheck(index);
        E old = elements[index];
        elements[index] = element;
        return old;
    }

    /**
     * Set a elements to the array
     */
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    /**
     * remove a elements to the array by index
     */
    public E remove(int index) {
        rangeCheck(index);
        E element = elements[index];
        //所有元素向前移动，但是最后一个元素在，需要把最后一个元素清除
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        elements[--size] = null;
        trim();
        return element;
    }

    /**
     * shrinkage capacity
     */
    private void trim() {
        int capacity = elements.length;
        int newCapacity = capacity >> 1;
        if (size >= newCapacity || capacity <= DEFAULT_CAPACITY) return;
        E[] newElements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    /**
     * Get a elements index to array
     */
    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) return i;
            }
        }
        return ELEMENT_NOT_FIND;
    }

    @Override
    public String toString() {
        StringBuilder rs = new StringBuilder();
        rs.append("Size:").append(size).append("  [");
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                rs.append(", ");
            }
            rs.append(elements[i]);
        }
        rs.append(" ]");
        return rs.toString();
    }

    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (oldCapacity >= capacity) return;
        // >> 除2   <<乘2
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        E[] newElements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

}
