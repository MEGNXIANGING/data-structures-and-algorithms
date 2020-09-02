package com.example.algorithm.designPatterns.strategy;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 上午1:32
 */
public class DogComparorByHashCode implements Comparor<Dog> {

    @Override
    public int compareTo(Dog o1, Dog o2) {
        if (o1.hashCode()>o2.hashCode())return 1;
        else return -1;
    }
}
