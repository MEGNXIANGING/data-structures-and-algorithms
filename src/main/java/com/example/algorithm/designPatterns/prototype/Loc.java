package com.example.algorithm.designPatterns.prototype;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 下午1:22
 */
public class Loc implements Cloneable{
     String local;
     String street;

    public Loc(String local, String street) {
        this.local = local;
        this.street = street;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
