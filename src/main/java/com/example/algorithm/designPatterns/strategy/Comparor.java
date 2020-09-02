package com.example.algorithm.designPatterns.strategy;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 上午1:14
 */
public interface Comparor<T> {
    int compareTo(T o1,T o2);
}
