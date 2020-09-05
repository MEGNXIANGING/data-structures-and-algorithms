package com.example.algorithm.datastructuresalgorithms.algor.stack;

import com.example.algorithm.datastructuresalgorithms.algor.List;
import com.example.algorithm.datastructuresalgorithms.algor.array.ArrayList;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/4 下午2:20
 */
public class Stack<E> {
    private List<E> list=new ArrayList();
    public int size(){
        return list.size();
    }

    public void push(E element){
        list.add(element);
    }

    public E pop(){
        return (E)list.remove(list.size()-1);
    }

    public E top(){
        return (E)list.get(list.size()-1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
