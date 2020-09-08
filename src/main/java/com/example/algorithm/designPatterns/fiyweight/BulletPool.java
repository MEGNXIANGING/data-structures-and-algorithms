package com.example.algorithm.designPatterns.fiyweight;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午5:53
 */
public class BulletPool {
    List<Bullet> bulletList=new ArrayList<>();
    {
        for (int i = 0; i < 5; i++) {
            bulletList.add(new Bullet());
        }
    }

    public Bullet getBullet(){
        for (int i = 0; i <bulletList.size() ; i++) {
            Bullet bullet = bulletList.get(i);
            if (!bullet.living){
                return bullet;
            }
        }
        return new Bullet();
    }
}
