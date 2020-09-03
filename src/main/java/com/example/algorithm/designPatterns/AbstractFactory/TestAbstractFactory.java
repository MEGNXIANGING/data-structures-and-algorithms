package com.example.algorithm.designPatterns.AbstractFactory;

/**
 * @Author: apple
 * @Description:
 *  抽象工厂
 *      名词用抽象类
 *      形容词用接口
 * @Date: 2020/9/3 下午3:44
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory factory = new MagicFactory();
        Food food = factory.getFood();
        food.printName();
        Vehicle vehicle = factory.getVehicle();
        vehicle.go();
        Weapon weapon = factory.getWeapon();
        weapon.shoot();
    }
}
