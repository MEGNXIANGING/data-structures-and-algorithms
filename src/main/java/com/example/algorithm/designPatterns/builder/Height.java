package com.example.algorithm.designPatterns.builder;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 下午12:06
 */
public class Height {
    private int a;
    private int b;
    private int c;

    public Height(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class weight{
    private int a;
    private int b;

    public weight(int a, int b) {
        this.a = a;
        this.b = b;
    }
}



class Long{
    private int d;
    private int e;

    public Long(int d) {
        this.d = d;
    }
}