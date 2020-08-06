package com.example.algorithm.datastructuresalgorithms.algor;

/**
 * @Author: apple
 * @Description: ..
 * @Date: 2020/2/27 下午10:29
 */
public interface List<E> {
      static final int ELEMENT_NOT_FIND = -1;

        void clear();
        /**
         * get collection size
         */
         int size() ;

        /**
         * Determine if the array is empty
         */
         boolean isEmpty() ;
        /**
         * Determine if the array contains this elements
         */
         boolean contains(E element);
        /**
         * Adds an elements to the array
         */
         void add(E element);

        /**
         * Get a elements to the array
         */
         E get(int index) ;

        /**
         * Set a elements to the array
         */
         E set(int index, E element);

        /**
         * Set a elements to the array
         */
         void add(int index, E element) ;

        /**
         * remove a elements to the array by index
         */
         E remove(int index) ;

        /**
         * Get a elements index to array
         */
         int indexOf(E element) ;

}
