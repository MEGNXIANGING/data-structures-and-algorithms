package com.example.algorithm.designPatterns.fiyweight;

import java.util.UUID;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午5:52
 */
public class Bullet {
    public UUID id=UUID.randomUUID();
    boolean living=true;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                ", living=" + living +
                '}';
    }
}
