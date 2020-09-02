package com.example.algorithm.datastructuresalgorithms.xiaomage.list;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/31 下午2:03
 */
public abstract class AbstractLIst<E> implements List {
    protected int size;
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object element) {
        return indexOf(element) != ELEMENT_NOT_FIND;
    }

    public void add(Object element) {
        add(size,element);
    }

    protected void rangeCheck(int index, int size) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index out of bound");
        }
    }

    protected void rangeCheckForAnd(int index, int size) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index out of bound");
        }
    }
}
