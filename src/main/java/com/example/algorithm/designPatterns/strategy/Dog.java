package com.example.algorithm.designPatterns.strategy;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 上午12:49
 */
public class Dog implements Comparable<Dog> {
    private int food;

    public Dog(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }

    @Override
    public int compareTo(Dog dog) {
        if (dog.food > this.food) return -1;
        else return 1;
    }
}
