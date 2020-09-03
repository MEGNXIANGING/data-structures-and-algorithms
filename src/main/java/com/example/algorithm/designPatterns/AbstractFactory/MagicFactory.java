package com.example.algorithm.designPatterns.AbstractFactory;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 下午3:43
 */
public class MagicFactory extends AbstractFactory {
    @Override
    Food getFood() {
        return new Banana();
    }

    @Override
    Vehicle getVehicle() {
        return new Broom();
    }

    @Override
    Weapon getWeapon() {
        return new MagicWand();
    }
}
