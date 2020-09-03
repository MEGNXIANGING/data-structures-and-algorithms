package com.example.algorithm.designPatterns.AbstractFactory;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 下午3:39
 */
public class MagicWand  implements Weapon{
    @Override
    public void shoot() {
        System.out.println("ding～～～");
    }
}
