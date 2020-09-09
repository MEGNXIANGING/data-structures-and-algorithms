package com.example.algorithm.designPatterns.prototype;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 下午1:21
 */
public class Person  implements Cloneable{
     String name;
     Loc loc;

    public Person(String name, Loc loc) {
        this.name = name;
        this.loc = loc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
