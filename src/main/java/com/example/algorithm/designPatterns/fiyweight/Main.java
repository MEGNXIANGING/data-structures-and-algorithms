package com.example.algorithm.designPatterns.fiyweight;


/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午7:20
 */
public class Main {
    public static void main(String[] args) {
        BulletPool bulletPool = new BulletPool();
        Bullet bullet = bulletPool.getBullet();
        System.out.println(bullet);
        String adc1="abc";
        String abc2="abc";
        //在常量池中，使用的是一个内存地址
        System.out.println(adc1==abc2);
        //在堆中
        String string = new String("abc");
        String string1 = new String("abc");
        System.out.println(string==string1);
        //堆中的指向
        System.out.println(string.intern()==abc2);
    }
}
