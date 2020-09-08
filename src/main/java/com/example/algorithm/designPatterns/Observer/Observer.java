package com.example.algorithm.designPatterns.Observer;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午3:34
 */
public interface Observer {
    //通过事件做出反应
    void actionOnWakeUp(WakeUpEvent event);
}
