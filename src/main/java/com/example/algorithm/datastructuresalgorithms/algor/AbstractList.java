package com.example.algorithm.datastructuresalgorithms.algor;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/2/27 下午10:42
 */
public abstract class AbstractList<E> implements List<E> {
    /**
     * number of elements
     */
    protected int size;

    public int size( ) {
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

    protected void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfBounds(index);
        }
    }

    protected void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }

    protected  void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("index:" + index + ",size:" + size);
    }

}
