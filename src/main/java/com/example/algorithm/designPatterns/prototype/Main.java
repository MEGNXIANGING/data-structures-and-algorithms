package com.example.algorithm.designPatterns.prototype;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 下午1:24
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("a", new Loc("dudu", "aa"));
        Person clone = (Person) person.clone();
        //  浅克隆
        System.out.println( clone.loc==person.loc);
    }
}
