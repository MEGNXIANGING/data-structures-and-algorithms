package com.example.algorithm.datastructuresalgorithms.mq;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/30 上午12:01
 */
public enum Type {
    CONSUME("CONSUME",1),
    SEND("SEND",2);

    private String typeName;
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    Type(String typeName, int value) {
        this.typeName = typeName;
        this.value = value;
    }

}
