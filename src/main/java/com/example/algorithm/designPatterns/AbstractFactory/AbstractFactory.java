package com.example.algorithm.designPatterns.AbstractFactory;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 下午3:40
 */
public abstract class AbstractFactory {
    abstract Food getFood();

    abstract Vehicle getVehicle();

    abstract Weapon getWeapon();
}
