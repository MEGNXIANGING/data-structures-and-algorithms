package com.example.algorithm.designPatterns.strategy;

import java.util.Arrays;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 上午1:02
 */
public class TestStrategy {
    public static void main(String[] args) {
        Dog[] a={new Dog(1),new Dog(5),new Dog(3),new Dog(8),new Dog(19)};
        Cat[] b={new Cat(2),new Cat(6),new Cat(4)};
//        Sort.sort(a,new DogComparorByFood());
        Sort.sort(a,new DogComparorByHashCode());
        System.out.println(Arrays.toString(a));
    }
}
