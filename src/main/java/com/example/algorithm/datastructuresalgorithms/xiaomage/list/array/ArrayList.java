package com.example.algorithm.datastructuresalgorithms.xiaomage.list.array;

import com.example.algorithm.datastructuresalgorithms.xiaomage.list.AbstractLIst;
import com.example.algorithm.datastructuresalgorithms.xiaomage.list.List;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/29 下午10:04
 */
public class ArrayList<E> extends AbstractLIst implements List {
    private int size;
    private E[] elements;


    public ArrayList(int cpa) {
        cpa = Math.max(cpa, DEFAULT_CAPACITY);
        elements = (E[]) new Object[cpa];
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }


    public void add(int index, Object element) {
        rangeCheckForAnd(index,size);
        ensureCapacity(index + 1);
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = (E) element;
        size++;
    }

    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (capacity <= oldCapacity) {
            return;
        }
        int newCapacity = oldCapacity + oldCapacity >> 1;
        E[] newElements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public E get(int index) {
        rangeCheck(index,size);
        return elements[index];
    }

    public E set(int index, Object element) {
        rangeCheck(index,size);
        E old = elements[index];
        elements[index] = (E) element;
        return old;
    }

    public E remove(int index) {
        rangeCheck(index,size);
        E old = elements[index];
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        elements[--size] = null;
        return old;
    }

    public int indexOf(Object element) {
        if (element==null){
            for (int i = 0; i < size; i++) {
                if (elements[i]==null) {
                    return i;
                }
            }
        }else {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(element)) {
                    return i;
                }
            }
        }
        return ELEMENT_NOT_FIND;
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
