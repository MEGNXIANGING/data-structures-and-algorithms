package com.example.algorithm.datastructuresalgorithms.xiaomage.list;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/31 下午1:50
 */
public interface List<E> {
     static final int DEFAULT_CAPACITY = 10;
     static final int ELEMENT_NOT_FIND = -1;
     void clear();

     int size();

     boolean isEmpty();

     boolean contains(E element);

     void add(E element);

     void add(int index, E element);

     E get(int index);

     E set(int index, E element);

     E remove(int index);

     int indexOf(E element);
}
