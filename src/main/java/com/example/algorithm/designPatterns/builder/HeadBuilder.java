package com.example.algorithm.designPatterns.builder;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 上午11:58
 */
public class HeadBuilder implements Builder {
    Person person = new Person();

    @Override
    public Builder setWeight() {
        System.out.println("weight is 50");
        weight weight = new weight(1, 2);
        person.weight = weight;
        return this;
    }

    @Override
    public Builder setHeight() {
        System.out.println("height is 100");
        Height height = new Height(1, 2, 3);
        person.height = height;
        return this;
    }

    @Override
    public Builder setLong() {
        System.out.println("long is 150");
        Long along = new Long(5);
        return this;
    }

    public Person builder() {
        return this.person;
    }
}
