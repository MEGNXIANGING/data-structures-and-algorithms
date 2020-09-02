package com.example.algorithm.designPatterns.strategy;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 上午12:50
 */
public class Cat implements Comparable<Cat> {
    private int weight;

    public Cat(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        if (cat.weight > this.weight) return -1;
        else return 1;
    }
}
