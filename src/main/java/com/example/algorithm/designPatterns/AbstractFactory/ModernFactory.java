package com.example.algorithm.designPatterns.AbstractFactory;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 下午3:41
 */
public class ModernFactory extends AbstractFactory{
    @Override
    Food getFood() {
        return new Dmg() ;
    }

    @Override
    Vehicle getVehicle() {
        return new Car();
    }

    @Override
    Weapon getWeapon() {
        return new AK47();
    }
}
