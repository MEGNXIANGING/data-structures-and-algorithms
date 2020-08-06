package com.example.algorithm.datastructuresalgorithms.algor.tree;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/4/19 下午12:52
 */
public class Person implements Comparable<Person> {
    private int age;

    public Person(int age){
        this.age=age;
    }

    @Override
    public int compareTo(Person o) {
        return age-o.age;
    }
}
