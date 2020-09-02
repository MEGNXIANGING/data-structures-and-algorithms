package com.example.algorithm.designPatterns.strategy;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 上午1:32
 */
public class DogComparorByFood implements Comparor<Dog> {

    @Override
    public int compareTo(Dog o1, Dog o2) {
        if (o1.getFood()>o2.getFood())return 1;
        else return -1;
    }
}
